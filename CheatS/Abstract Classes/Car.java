package mypackage;

public class Car extends Vehicle{

    Car(){

    }
    @Override
    void go(){ // overriding the abstract method.
        System.out.println("Driving the car!");
    }
}
