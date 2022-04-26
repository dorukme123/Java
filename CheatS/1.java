import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // array = used to store multiple values in a single variable.
        String[] cars = {"Camaro","Corvette","Tesla"};

        cars[0] = "Mustang";
        System.out.println(cars[0]);
        // limiting
        String[] arabalar = new String[3];
        arabalar[0] = "Camaro";
        arabalar[1] = "Corvette";
        arabalar[2] = "Tesla";
        for (int i = 0; i < arabalar.length; i++) {
            System.out.println(arabalar[i]);
        }
        //2d arrays
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = {{1,2,3},{2,3,4},{6,7,8}};


        for (int i = 0; i < arr1.length; i++) {
            System.out.println();
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("[ " + arr1[i][j] + " ]");
            }
        }
    }
}