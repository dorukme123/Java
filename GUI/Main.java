import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // JOptionPane = interactive informer somesort.
        ImageIcon icon = new ImageIcon("anything.png");
        JOptionPane.showMessageDialog(null, "plain", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "info", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "useless box?", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "useless box!", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "java: illegal start of expression", "title", JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null,"hi","title",JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog("what is your name: ?");
        System.out.println("Hello " + name);
        String[] responses = {"Yes you are","No you are","why you are?"};
        JOptionPane.showOptionDialog(null,
                "Are you?",
                "You are?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);


    }
}