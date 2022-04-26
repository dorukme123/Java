package mypackage;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(60.0);
        Bicycle bicycle = new Bicycle(15.0);
        car.go();
        bicycle.stop();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);
    }
}