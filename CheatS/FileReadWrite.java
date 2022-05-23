import java.io.*;

public class Main {
    public static void main(String[] args) {
            // file = an abstract representation of file and directory.
        File file = new File("src/secret.txt");
        if(file.exists()){
            System.out.println("yea");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete(); deletes file.

        }
        else{ System.out.println("no"); }
        try {
            FileWriter fileWriter = new FileWriter("src/secret.txt");
            fileWriter.write("aaaaaaaaa");
            fileWriter.append("\nim burning");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader = new FileReader("src/secret.txt");
            int data = fileReader.read();
            while(data != -1){
                System.out.print((char)data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
