

public class Main {
    public static void main(String[] args) {
        //String methods:

        String name = "Doruk";

        boolean result = name.equalsIgnoreCase("Doruk"); // return a boolean to confirm!

        System.out.println(result);

        // int intResult = name.length();
        // char charResult = name.charAt(0); // icindeki harfleri bulmak fasa fiso.
        // int intCharResult = name.indexOf("B"); // harfin yerini falan kac tane varsa hesaplarsin vs...
        // boolean boolresult = name.isEmpty(); // bos mu dolumu.
        // toUpperCase yada toLowerCase methodlarida var.
        // String result = name.trim(); // bosluklari atiyor.
        // String result = name.replace('o' , 'a'); //o yerine a yaz.


        // Wrapper classes = provides a way to use primitave data as object or referance data types which can use some methods.

        // primitive     //wrapper
        //----------     //-------
        // boolean       Boolean
        // char          Character
        // int           Integer
        // double        Double

        // autoboxing = the automatic conversion that the java comp makes between them.
        // unboxing = the reverse of autoboxing.

        Boolean a = true;
        Character b = 'a';
        Integer c = 123;
        Double d = 3.14;
        Float e = 3.12f;
        String e = "doruk";


    }

}
