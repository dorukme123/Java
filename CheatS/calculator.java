import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        int key = 0;
        do {
            menu();
            int sys;
            sys = scanner.nextInt();
            if(sys == 1)
            {
                System.out.println("Enter number x: ");
                x =scanner.nextInt();
                System.out.println("Enter number y: ");
                y = scanner.nextInt();
                System.out.println("Result : "+add(x,y));
            }
            else if (sys == 2)
            {
                System.out.println("Enter number x: ");
                x =scanner.nextInt();
                System.out.println("Enter number y: ");
                y = scanner.nextInt();
                System.out.println("Result : "+divide(x,y));
            }
            else if (sys == 3)
            {
                System.out.println("Enter number x: ");
                x =scanner.nextInt();
                System.out.println("Enter number y: ");
                y = scanner.nextInt();
                System.out.println("Result : "+multip(x,y));
            }
            else
            {
                System.out.println("Exiting....");
                key = 1;
            }

        }while(key != 1);

    }
    static int add(int a,int b){
        int result = a + b;

        return result;
    }
    static int divide(int a,int b){
        int result = a / b;

        return result;
    }
    static int multip(int a,int b){
        int result = a * b;

        return result;
    }
    static void menu(){
        System.out.println("Menu: ");
        System.out.println("1-Add ");
        System.out.println("2-Divide ");
        System.out.println("3-Multiply ");
        System.out.println("0-Exit ");
    }
}