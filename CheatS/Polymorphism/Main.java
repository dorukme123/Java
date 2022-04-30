package mypackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = The ability of an object to identify as more than one type.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        Vehicle vehicle = new Vehicle();

        Vehicle[] racers = {car,bicycle,boat}; // also identify as vehicles.

        for (Vehicle x : racers){
            x.go();
        }

        // Dynamic polymorphism = during runtime (after compilation)
        // like : Animal animal = new dog() or cat();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of Vehicle do you want\n" + "1.Boat:\n" + "2.Car:\n" );
        int choice = scanner.nextInt();
        if(choice == 1){
            vehicle = new Boat();
            vehicle.go();
        } else if (choice == 2) {
            vehicle = new Car();
            vehicle.go();
        } else System.out.println("Wrong type");
        // it like wow class like paladin archer etc.. after you picked the class
        // itll show up and create it.
    }
}