package mypackage;

public class Main {
    public static void main(String[] args) {

        // super = keyword refers to the superclass (parent) of an object
        //         very similar to "this" keyword.

        Hero hero1 = new Hero("Batman",42,"$$$");
        Hero hero2 = new Hero("Superman",43,"Everything");

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }
}