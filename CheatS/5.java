import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;
        //max,min,ceil,round,sqrt,abs,floor
        double z = Math.max(x,y);
        double t = Math.min(x,y);
        System.out.println(z);
        System.out.println(t);
        //program that determines if the triangle is a right triangle.
        double a,b,c;
        double arr[] = {0,0,0};
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter Value " + i + ":");
            arr[i] = scanner.nextDouble();
        }
        a = arr[0];
        b = arr[1];
        c = arr[2];
        if(c == Math.sqrt((a*a)+(b*b))) {
            System.out.println("Correct!");
            System.out.println(" " + a + " " + b + " " + c);
        } else {
            System.out.println("Not correct!");
        }
    }
}
