import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Set;

public class Car extends Vehicle{
    private float MovingAngle = 0;

    Car(String name, String companyName, String ownerName, int mileage, String vinCode) {
        super(name, companyName, ownerName, mileage, vinCode);
    }
    Car(CarBuilder builder){
        this(builder._name,builder._companyName,builder._ownerName,builder._mileage, builder._vinCode);
        this._mileage = builder._mileage;
    }
    /**
     *
     * Controls Car
     *
     * @param turn  turn of the controls
     */
    public String TurnIt(Turns turn){
        String operationResult = "Nothing happens";
        switch (turn){
            case RightTurn: {
                operationResult = RightTurn();
                break;}
            case LeftTurn : {
                operationResult = LeftTurn();}
        }
        return operationResult;
    }

    private String RightTurn(){MovingAngle++;  return "The right turn angle has increased";}
    private String LeftTurn(){MovingAngle--;return "The left turn angle has increased";}

    public int compareTo(Car o2) {
        return _mileage - o2.getMileage();
    }
    public static class CarBuilder{
        @Pattern(regexp = "[A-Z][a-zA-Z0-9 ]*", message = "Name must begins with capital")
        private String _name;
        @Pattern(regexp = "[A-Z][a-zA-Z0-9 ]*", message = "Company must begins with capital")
        private String _companyName;
        @Pattern(regexp = "[A-Z][a-zA-Z0-9 ]*", message = "Owner name must begins with capital")
        private String _ownerName;
        @Min(value = 0, message = "mileage must be positive")
        private int _mileage;
        @Pattern(regexp = "([0-9-A-Z]){10}", message = "VinCode must contain up to 10 symbols seperated by spaces")
        private String _vinCode;
        @Min(value = -180, message = "Moving  angle must be between -180 and 180")
        @Max(value = 180, message = "Moving angle be between -180 and 180")
        private float _movingAngle;

        public CarBuilder setName(String name)
        {
            _name = name;
            return this;
        }
        public CarBuilder setCompanyName(String companyName)
        {
            _companyName = companyName;
            return this;
        }
        public CarBuilder setOwnerName(String ownerName)
        {
            _ownerName = ownerName;
            return this;
        }
        public CarBuilder setMileage(int mileage)
        {
            _mileage = mileage;
            return this;
        }
        public CarBuilder setVinCode(String vinCode)
        {
            _vinCode = vinCode;
            return this;
        }
        public CarBuilder setMovingAngle(float movingAngle)
        {
            _movingAngle = movingAngle;
            return this;
        }
        void validate() {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();

            Set<ConstraintViolation<Car.CarBuilder>> constraintViolations = validator.validate(this);

            StringBuilder sb = new StringBuilder();

            for (var t : constraintViolations) {
                sb.append("Error for '" + t.getInvalidValue() + "' : " + t.getMessage() + '\n');
            }

            if (sb.length() > 0){
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public Car CreateInstance() {
            var car = new Car(this);
            validate();
            return car;
        }
    }
}