import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame implements ActionListener {

    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton("Submit");


    CheckBox(){



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        customizeCheckBox();
        customizeButton();
        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    protected void customizeCheckBox(){
        ImageIcon checkIcon = new ImageIcon("anything.png");
        ImageIcon crossIcon = new ImageIcon("anything.png");
        checkBox.setText("Are you?");
        checkBox.setBackground(Color.darkGray);
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Ariel",Font.BOLD,23));
        checkBox.setForeground(Color.green);
        checkBox.setIcon(crossIcon); // cross
        checkBox.setSelectedIcon(checkIcon); // check
    }
    protected void customizeButton(){
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBackground(Color.darkGray);
        button.setForeground(Color.green);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
}
