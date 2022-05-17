import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JLayeredPane = Swing container that provides a third
        //                dimension for positioning components depth and z-index.

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(100,100,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(150,150,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(200,200,200,200);

        JLayeredPane layeredPane = new JDesktopPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER); // Integer.valueOf(2)
        layeredPane.add(label3,JLayeredPane.DRAG_LAYER); // Integer.valueOf(3) higher the number higher it stacks up

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);

        frame.setVisible(true);
    }
}
