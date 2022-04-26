package mypackage;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.year);
        System.out.println(myCar.price);
        myCar.brake();
        myCar.drive();

    }
}