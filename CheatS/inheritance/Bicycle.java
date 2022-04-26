package mypackage;

public class Bicycle extends Vehicle{
    int pedals = 2; // car cannot access here.
    Bicycle(double speed){
        this.speed = speed;
    }
}
