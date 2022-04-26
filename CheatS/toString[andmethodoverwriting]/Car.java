package carpackage;

public class Car {
    String make = "porche";
    String model = "cayenne";
    String color = "gray";
    int year = 2016;
    Car(){

    }
    public String toString(){
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
    }
}
