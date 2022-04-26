public class oveloadedmethods {

    public static void overmethods(String[] args){

        // overloaded methods = methods that share the same name but have different parametres
        add(1,2);
        add(1.0,2.0);
        add(1,2,3);
        add(1.0,2.0,3.0);
        add(1,2,3,4);
        add(1.0,2.0,3.0,4.0);

    }
    static int add(int a, int b){
        System.out.println("overloaded 1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("overloaded 2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("overloaded 3");
        return a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("overloaded 4");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("overloaded 5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("overloaded 6");
        return a + b + c + d;
    }
}
