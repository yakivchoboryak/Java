import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Garage {
    private List<Car> _cars;

    public Garage(){
        _cars =  new ArrayList<>();
    }

    public Garage(List<Car> cars){
        _cars =  cars;
    }

    public Garage(Car[] devices) {
        _cars = Arrays.asList(devices);
    }

    public String[] getNames() {
        Set<String> names = new HashSet<>();

        for (Car _car : _cars) {
            String name = _car.getName();
            names.add(name);
        }

        return names.toArray(String[]::new);
    }

    public String[] getCompanyNames() {
        Set<String> names = new HashSet<>();

        for (Car _car : _cars) {
            String companyName = _car.getCompanyName();
            names.add(companyName);
        }

        return names.toArray(String[]::new);
    }

    public Car[] sortByMileageStream() {
        return _cars.stream().sorted(new CarComparator()).toArray(Car[]::new);
    }

    public Car[] sortByMileage() {
        var arr = new ArrayList<Car>(_cars);

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    Car temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr.toArray(Car[]::new);
    }

    public Car[] getNewerCars(int mileage) {
        ArrayList<Car> carlist = new ArrayList<Car>();

        for (Car d : _cars) {
            if (d.getMileage() < mileage) {
                carlist.add(d);
            }
        }

        Car[] cars = new Car[carlist.size()];

        carlist.toArray(cars);
        return cars;
    }

    public Car[] getNewerCarsStream(int mileage) {
        ArrayList<Car> carlist ;

        carlist = new ArrayList<Car>(_cars.stream().filter(car -> {return  car.getMileage() < mileage;}).collect(Collectors.toList()));

        return carlist.toArray(Car[]::new);
    }

    public Car[] getCarsByOwnerName(String ownerName) {
        ArrayList<Car> carlist = new ArrayList<Car>();

        for (Car d : _cars) {
            if (d.getOwnerName() == ownerName) {
                carlist.add(d);
            }
        }

        Car[] cars = new Car[carlist.size()];

        carlist.toArray(cars);
        return cars;
    }
}
