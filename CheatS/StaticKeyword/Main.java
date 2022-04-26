package mypackage;

public class Main {
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method,
        //                    that is created and shared.
        //                    the class ows the static member.

        Friend friend1 = new Friend("friend1");
        Friend friend2 = new Friend("friend2");
        Friend friend3 = new Friend("friend3");

        System.out.println(Friend.numberOfFriends); // accessing it from only the class.
        // do not access from an object like friend1.numberOfFriends.
        // if we remove the static variable we cannot access it anymore.
        // it only accesses to them and every number will be 1.
        Friend.displayFriends(); // we can use it like this if we create a method for it.

    }
}