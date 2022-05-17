import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main{


    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        while(true){
            frame.invalidate();
            frame.validate();
            frame.repaint();
        }



    }


}