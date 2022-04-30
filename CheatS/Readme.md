
### CheatSheet/Examples 

#### Access Modifiers:
// just so not to forget about them.
- Default :: Packages cant access.
- Public :: Everyone can access.
- Protected :: Only can be used inside the so called package.
- Private :: Only the **containing class** can access it!.

to import a package " **import** anypackage.* " in here * means everything but u can just import the class etc...

### Exception handling (**Really important**)

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exception = an event that occurs during the execution
        //             of a program that, disrupts the normal flow of instructions.
        //             unexpected events that occur that gives me headaches!

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number: ");
            int x = scanner.nextInt();

            System.out.println("Enter another whole number to divide: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result:" + z);
        }
        catch(ArithmeticException e){
            System.out.println("You cant do that plz :(");
        }
        catch (InputMismatchException a){
            System.out.println("Dont enter Strings :(");
        }
        catch(Exception b){ //catches all exceptions no matter what.
            System.out.println("i really dont know what to say");

```
