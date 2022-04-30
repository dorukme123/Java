package mypackage;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Chevy","Camaro",2005);
        Car car2 = new Car("Ford","Mustang",1987);

        System.out.println(car1.toString());
        System.out.println(car2.toString());

        // Copy method :
        car2.copy(car1);
        // Creating a copy constructor :
        Car car3 = new Car(car1);
        System.out.println(car3.toString());
    }
}