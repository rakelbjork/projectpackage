package d_factorypattern;

public class CarFactory {
    public Car createCar(CarType carType){
        return switch (carType) {
            case FAST -> new Car();
            case SLOW -> new Car();
        };
    }
}