package carpackage;

public class Main {
    public static void main(String[] args) {

    // toString() = a special method that all objects inherit,
    //          that returns a string that "textually represents" an object.

        Car car = new Car();

        System.out.println(car);
        // or system.out.println(car.toString());
        // cuz we have overwritten the method we can use it
        // implicit or explicitly.
    }
}
