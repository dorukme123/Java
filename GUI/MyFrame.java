import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button = new JButton("submit");
    JTextField textField = new JTextField();
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBackground(Color.BLACK);
        this.setForeground(Color.BLACK);

        textField.setPreferredSize(new Dimension(250,40));

        button.addActionListener(this);
        customizeTextField();

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
    protected void customizeTextField(){
        textField.setFont(new Font("Ariel",Font.BOLD,35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.darkGray);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            String text = textField.getText();
            JOptionPane.showMessageDialog(null,text,"Output",JOptionPane.PLAIN_MESSAGE);
            textField.setText(text);
            textField.setEditable(false);
        }
    }
}
