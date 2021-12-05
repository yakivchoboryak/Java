public class Car extends Vehicle{
    private float MovingAngle = 0;

    Car(String name, String companyName, String ownerName, int mileage, String vinCode) {
        super(name, companyName, ownerName, mileage, vinCode);
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
}
