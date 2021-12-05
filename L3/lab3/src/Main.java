public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("Volkswagen Golf","Volkswagen","Alex",568653,"BF34415ANB"),
                new Car("Opel Astra","Opel","Nick",432234,"KR67979BBR"),
                new Car("Aston Martin Vantage","Aston Martin Lagonda Group Limited","Thor",102341,"AL20084GRD"),
                new Car("Discovery","Land Rover","Rick",95343,"UL64534JDK"),
                new Car("Volkswagen Passat","Volkswagen","Kek",984123,"LL63324FAS"),
                new Car("Porsche 918 Spyder","Porsche","Joe",321342,"KR42456LUA")
        };

        Garage garage = new Garage(cars);

        System.out.println(".... Get Names ....");
        for (String name : garage.getNames()) {
            System.out.println(name);
        };
//
        System.out.println(".... Get Company Names ....");
        for (String companyNames : garage.getCompanyNames()) {
            System.out.println(companyNames);
        };
//
        System.out.println(".... Sort By Mileage Stream ....");
        for (Car car : garage.sortByMileageStream()) {
            System.out.println(car.getMileage());
        };
//
        System.out.println(".... Sort By Mileage ....");
        for (Car car : garage.sortByMileage()) {
            System.out.println(car.getMileage());
        };
//
        System.out.println(".... Cars With Mileage < 432234 ....");
        for (Car car : garage.getNewerCars(432234)) {
            System.out.println(car.getName() + " [|] " + car.getMileage());
        };
//
        System.out.println(".... Joe Cars ....");
        for (Car car : garage.getCarsByOwnerName("Joe")) {
            System.out.println(car.getName() + " [|] " + car.getCompanyName() + " [|] " + car.getMileage());
        };
//
        System.out.println(".... Cars Stream With Mileage < 432234 ....");
        for (Car car : garage.getNewerCarsStream(432234)) {
            System.out.println(car.getName() + " [|] " + car.getMileage());
        };

    }
}
