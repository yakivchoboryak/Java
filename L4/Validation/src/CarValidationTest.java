
import org.testng.annotations.Test;
public class CarValidationTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void CarNameTestFailure() {
        new Car.CarBuilder().setName("volvo").CreateInstance();
    }
    @Test
    public void CarNameTest() {
        new Car.CarBuilder().setName("Volvo").CreateInstance();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void CarCompanyNameTestFailure() {
        new Car.CarBuilder().setName("volvo").CreateInstance();
    }
    @Test
    public void CarCompanyNameTest() {
        new Car.CarBuilder().setName("Volvo").CreateInstance();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void CarMileageTestFailure() {
        new Car.CarBuilder().setMileage(-6783).CreateInstance();
    }
    @Test
    public void CarMileageTest() {
        new Car.CarBuilder().setMileage(67832).CreateInstance();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void CarMovingAngleTestFailure() {
        new Car.CarBuilder().setMovingAngle(-181).CreateInstance();
    }
    @Test
    public void CarMovingAngleTest() {
        new Car.CarBuilder().setMileage(180).CreateInstance();
    }
    @Test
    public void CarVinCodeTest() {
        new Car.CarBuilder().setVinCode("AAA123487B").CreateInstance();
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void CarVinCodeTestFailur1() {
        new Car.CarBuilder().setVinCode("8SYMBOLS").CreateInstance();
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void CarVinCodeTestFailure2() {
        new Car.CarBuilder().setVinCode("11SYMBOLSSSS").CreateInstance();
    }
}
