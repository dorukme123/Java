
public class Main {

    public static void main(String[] args) {

        // printf(): an optional method to control,
        //           format, and display text to the
        //           console window.
        //           % [flags] [precision] [width] [conversion-character]

        System.out.printf("%d This is a format string",123);
        boolean myBoolean = true;
        char myChar = '$';
        String myString = "name";
        int myInt = 0;
        double myDouble = 1000;

        System.out.printf("\n%b",myBoolean); // %b for boolean.
        System.out.printf("\n%c",myChar); // %c for char.
        System.out.printf("\n%s",myString); // %s for string.
        System.out.printf("\n%d",myInt); // %d for integers.
        System.out.printf("\n%f",myDouble); // %f for floats and doubles.

        //[width]
        // minimum number of chars to display.
        System.out.printf("\nHello %10s",myString);
        //[precision]
        // sets number of digits of precision when outputting the value.
        System.out.printf("\nYou have this much money %f",myDouble); // %.1,.2 falan ekstra 0 ekliyor sonuna.

        //[flags]
        // adds an effect to output based on the flag added to format specifier.
        // - : left-justify.
        System.out.printf("\nYou have %20f",myDouble);
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value.
        System.out.printf("\nYou have %+f",myDouble); // eksi yapmak istiyorsan sayiyi eksi yap.
        // 0 : numeric values are zero-padded.
        System.out.printf("\nYou have %020f",myDouble);
        // , : comma grouping separator if numbers > 1000.
        System.out.printf("\nYou have %,f",myDouble); // binlikleri belirler.



    }
}