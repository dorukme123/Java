package mypackage;

public class Car extends Vehicle{
    int wheels = 4; // bicycle cannot access here.
    Car(double speed){
        this.speed = speed;
    }
}
