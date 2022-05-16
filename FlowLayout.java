import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    MyFrame(){
        this.setSize(600,600);
        this.setTitle("FlowLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setResizable(true);
        this.setBackground(new Color(20,80,20));

        for (int i = 0; i < 18; i++) {
            String s = Integer.toString(i+1);
            panel.add(new JButton(s));
        }
        this.add(panel);



        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
