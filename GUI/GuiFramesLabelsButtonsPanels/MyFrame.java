import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JLabel labelAfterButton = new JLabel();

    MyFrame(){
        // JFrame
        JPanel panelBlue = new JPanel();
        JPanel panelRed = new JPanel();
        JPanel panelGreen = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        Border border = BorderFactory.createLineBorder(Color.red,3);

        button1.setBounds(300,600,100,50);
        button2.setBounds(400,600,100,50);
        button1.setBackground(new Color(20,20,110));
        button2.setBackground(new Color(110,20,20));
        button1.setText("Blue");
        button2.setText("Red");
        button1.addActionListener(e -> labelAfterButton.setVisible(true)); // lambda functions
        button2.addActionListener(e -> labelAfterButton.setVisible(false));
        button1.setFocusable(false);
        button2.setFocusable(false);
        button1.setForeground(Color.green);
        button2.setForeground(Color.green);
        button1.setBorder(BorderFactory.createBevelBorder(5));
        button2.setBorder(BorderFactory.createEtchedBorder());


        this.setSize(800,800); // set x and y
        this.setTitle("Frame"); // create title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit when closed
        this.setResizable(true); // prevents resizing

        panelBlue.setBackground(Color.BLUE);
        panelBlue.setBounds(325,50,50,50);
        panelRed.setBackground(Color.RED);
        panelRed.setBounds(375,50,50,50);
        panelRed.setLayout(new BorderLayout()); // to set place.
        panelGreen.setBackground(Color.GREEN);
        panelGreen.setBounds(425,50,50,50);



        ImageIcon image = new ImageIcon("");
        ImageIcon image1 = new ImageIcon("");
        ImageIcon image2 = new ImageIcon("");
        ImageIcon image3 = new ImageIcon("");
        labelAfterButton.setIcon(image3);
        labelAfterButton.setBounds(325,300,200,200);
        labelAfterButton.setVisible(false);
        this.setIconImage(image.getImage()); // get image
        label2.setIcon(image2);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.CENTER);
        label1.setIcon(image1);
        label1.setHorizontalTextPosition(JLabel.CENTER); // aligning text
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setForeground(new Color(80,20,200)); // label color
        label1.setFont(new Font("Comic Sans",Font.BOLD,40)); // font and size
        label1.setIconTextGap(-80); // the gap between image and text
        label1.setBackground(new Color(80,190,150)); // label background
        label1.setOpaque(true); // to bg to work
        label1.setBorder(border); // setting border.
        label1.setVerticalAlignment(JLabel.CENTER); // icon + text
        label1.setHorizontalAlignment(JLabel.CENTER); // icon + text
        // label1.setBounds(0,0,250,250);

        this.getContentPane().setBackground(new Color(220,220,125)); // set bg color
        // 0xFFFFF can be also placed hex
        label1.setText("Hello!");
        this.add(labelAfterButton);
        this.add(button1);
        this.add(button2);
        this.add(panelBlue);
        this.add(panelRed);
        panelRed.add(label2);
        this.add(panelGreen);
        this.add(label1);


        // this.setLayout(null);
         // add this after everything also.
        this.setVisible(true); // make frame visible (always use this at the end)
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
