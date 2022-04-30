package mypackage;

import mypackage.*;
public class Main {
    public static void main(String[] args) {

        // Encapsulation : attributes of a class will be hidden or private,
        //                 Can be accessed only through methods (get&set)
        //                 You should make attributes private if you don't have a
        //                 reason to make them public || protected.

        Car car = new Car("Lada","Normal",1997);
        // make sure that when you run this code class main are in the same package.
        System.out.println(" ");
    }
}