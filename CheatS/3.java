import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // array lists:

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        // some usefull methods:
        food.set(0, "Sushi"); // yerine bunu koy replace gibi.
        food.remove(1); // listeden sil.
        food.clear();

        // 2d array lists: a dynamic list of lists.

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("Garlic");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomato");
        produceList.add("zuccini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("soda");
        drinkList.add("sok");
        drinkList.add("cola");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(1)); // arr[][] gibi dusun.


    }
}