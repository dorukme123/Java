import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame windowFrame = new JFrame();
    JLabel label = new JLabel("Hello");
    NewWindow(){

        label.setBounds(200,225,100,50);
        label.setFont(new Font("Arial",Font.BOLD,20));

        windowFrame.add(label);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setSize(500,500);
        windowFrame.setLayout(null);

        windowFrame.setVisible(true);
    }
}
