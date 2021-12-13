package d_factorypattern;

public class FactoryPattern {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        int roundOne = 1;
        Car fastCar = carFactory.createCar(CarType.FAST);
        Car slowCar = carFactory.createCar(CarType.SLOW);
    }
}
