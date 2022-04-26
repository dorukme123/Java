package mypackage;

public class Main {
    public static void main(String[] args) {
        // object passing:
        Garage garage = new Garage();

        Car car1 = new Car("bmw");
        Car car2 = new Car("mazda");

        garage.park(car1);
        garage.park(car2);


    }
}