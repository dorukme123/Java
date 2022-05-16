import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JPanel panel1 = new JPanel(); JPanel panel6 = new JPanel();
    JPanel panel2 = new JPanel(); JPanel panel7 = new JPanel();
    JPanel panel3 = new JPanel(); JPanel panel8 = new JPanel();
    JPanel panel4 = new JPanel(); JPanel panel9 = new JPanel();
    JPanel panel5 = new JPanel(); JPanel panel10 = new JPanel();
    MyFrame(){
        this.setSize(600,600);
        this.setTitle("BorderLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        this.setResizable(true);
        this.setBackground(new Color(20,80,20));

        panelSetup();

        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.WEST);
        this.add(panel3,BorderLayout.SOUTH);
        this.add(panel4,BorderLayout.EAST);
        this.add(panel5,BorderLayout.CENTER);



        this.setVisible(true);

    }
    public void panelSetup(){
        // main panels :
        panel1.setBackground(Color.pink);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.gray);
        panel4.setBackground(Color.black);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        // flow panel :
        panel5.setLayout(new BorderLayout());
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.SOUTH);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);
        // sub panels :
        panel6.setBackground(Color.magenta);
        panel7.setBackground(Color.lightGray);
        panel8.setBackground(Color.YELLOW);
        panel9.setBackground(Color.cyan);
        panel10.setBackground(Color.DARK_GRAY);

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
