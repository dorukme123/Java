import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // for each loop:

        String[] animals = {"cat","dog","tiger","lion"};

        for(String i : animals) {
            System.out.println(i);
        }

        ArrayList<String> arabalar = new ArrayList<String>();
        arabalar.add("corvette");
        arabalar.add("bmw");
        arabalar.add("mercedes");

        for(String i : arabalar){
            System.out.println(i);
        }
    }
}