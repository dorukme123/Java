import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
    LaunchPage(){

        button.setBounds(200,225,100,50);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setFont(new Font("Comic Sans",Font.BOLD,10));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            NewWindow window = new NewWindow();
        }
    }
}
