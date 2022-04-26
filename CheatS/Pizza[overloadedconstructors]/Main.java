package pizzapackage;

public class Main {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters.
        //                           name + parameter = signature.


        Pizza pizza1 = new Pizza("thicc crust","tomato","mozarella","pepperoni");
        Pizza pizza2 = new Pizza("crust","tomato","gauda");
        Pizza pizza3 = new Pizza("garlic corners","tomato");
        Pizza pizza4 = new Pizza("flat bread");

        System.out.println("pizza :");
        System.out.println("Bread : "+pizza1.bread);
        System.out.println("Sauce : "+pizza1.sauce);
        System.out.println("Cheese : "+pizza1.cheese);
        System.out.println("Topping : "+pizza1.topping);

        System.out.println("pizza2 :");
        System.out.println("Bread : "+pizza2.bread);
        System.out.println("Sauce : "+pizza2.sauce);
        System.out.println("Cheese : "+pizza2.cheese);

        System.out.println("pizza3 :");
        System.out.println("Bread : "+pizza3.bread);
        System.out.println("Sauce : "+pizza3.sauce);

        System.out.println("pizza4 :");
        System.out.println("Bread : "+pizza4.bread);
    }
}