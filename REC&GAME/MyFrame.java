
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import snakeGame.*;
import cube.*;
import tictactoe.TictactoeGame;


public class MyFrame extends JFrame implements ActionListener{
    // Icons:
    public static int x;
    ImageIcon titleIcon = new ImageIcon("src/resource/rectangle.png");


    MyFrame() {
        // Options :
        this.setSize(600, 600);
        this.setTitle("Rec Rotate & Game hub");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLACK);
        this.setIconImage(titleIcon.getImage());
        // Methods :
        panelSetup();
        buttonSetup();
        labelSetup();
        // Setup panel :
        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.SOUTH);
        // this.add(centerPanel, BorderLayout.CENTER);
        this.add(new JPanel(){
            public void paintComponent (Graphics g){
                super.paintComponents(g);
                Graphics2D g2d = (Graphics2D)g;
                g2d.setColor(new Color(0x50B09F));
                Rectangle rect2 = new Rectangle(0, 50, 100, 50);
                g2d.translate(rect2.x+(200), rect2.y+(100));
                g2d.rotate(Math.toRadians(x));
                g2d.draw(rect2);
                g2d.fill(rect2);
            }
        });
        // Resize :
        this.setResizable(false);
        // Visible :
        this.setVisible(true);
        this.revalidate();



    }

    protected void panelSetup() {
        // color :
        leftPanel.setBackground(new Color(0x746F6E));
        rightPanel.setBackground(new Color(0x746F6E));
        topPanel.setBackground(new Color(0xB3B2B2));
        bottomPanel.setBackground(new Color(0x3C3B3B));
        //centerPanel.setBackground(new Color(0xFFFFFF));
        // size :
        leftPanel.setPreferredSize(new Dimension(100, 100));
        rightPanel.setPreferredSize(new Dimension(100, 100));
        topPanel.setPreferredSize(new Dimension(250, 100));
        bottomPanel.setPreferredSize(new Dimension(250, 100));
        //centerPanel.setPreferredSize(new Dimension(250, 250));
        // layout sub panels :
        leftPanel.setLayout(new GridLayout(3, 1));
        rightPanel.setLayout(new GridLayout(3, 1));
        topPanel.setLayout(new BorderLayout());
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //centerPanel.setLayout(null);
        // Border :
        topPanel.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bottomPanel.setBorder(BorderFactory.createLineBorder(Color.black,1));
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.black,1));
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.black,1));
        //centerPanel.setBorder(BorderFactory.createLineBorder(Color.black,1));
        // Center Panel :
    }

    protected void buttonSetup() {
        // add buttons :
          // Left :
            leftPanel.add(left1); left1.setText("+45"); left1.setFont(new Font("Arial",Font.BOLD,15));
            leftPanel.add(left2); left2.setText("+90"); left2.setFont(new Font("Arial",Font.BOLD,15));
            leftPanel.add(left3); left3.setText("+180"); left3.setFont(new Font("Arial",Font.BOLD,15));
          // Right :
            rightPanel.add(right1); right1.setText("-45"); right1.setFont(new Font("Arial",Font.BOLD,15));
            rightPanel.add(right2); right2.setText("-90"); right2.setFont(new Font("Arial",Font.BOLD,15));
            rightPanel.add(right3); right3.setText("-180"); right3.setFont(new Font("Arial",Font.BOLD,15));
        // Color :
          // Left :
            left1.setForeground(new Color(0x000000)); left1.setBackground(new Color(0x757675));
            left2.setForeground(new Color(0x000000)); left2.setBackground(new Color(0x757675));
            left3.setForeground(new Color(0x000000)); left3.setBackground(new Color(0x757675));
          // Right
            right1.setForeground(new Color(0x000000)); right1.setBackground(new Color(0x757675));
            right2.setForeground(new Color(0x000000)); right2.setBackground(new Color(0x757675));
            right3.setForeground(new Color(0x000000)); right3.setBackground(new Color(0x757675));
        // Border :
          // Left :
            left1.setBorder(BorderFactory.createLineBorder(Color.black,1));
            left2.setBorder(BorderFactory.createLineBorder(Color.black,1));
            left3.setBorder(BorderFactory.createLineBorder(Color.black,1));
          // Right :
            right1.setBorder(BorderFactory.createLineBorder(Color.black,1));
            right2.setBorder(BorderFactory.createLineBorder(Color.black,1));
            right3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        // ActionListener :
        left1.addActionListener(this); right1.addActionListener(this);
        left2.addActionListener(this); right2.addActionListener(this);
        left3.addActionListener(this); right3.addActionListener(this);
        // Disabling focus cuz it looks bad :
        left1.setFocusable(false); left2.setFocusable(false); left3.setFocusable(false);
        right1.setFocusable(false); right2.setFocusable(false); right3.setFocusable(false);
        // Start :
        bottomPanel.add(startButton); startButton.setText("Reset"); startButton.setFont(new Font("Arial",Font.BOLD,28));
        startButton.setForeground(new Color(0x000000)); startButton.setBackground(new Color(0x757675));
        startButton.setBorder(BorderFactory.createLineBorder(Color.black,1));
        startButton.addActionListener(this); startButton.setFocusable(false);
        // snakeGame:
        bottomPanel.add(openSnakeGame); openSnakeGame.setText("SnakeGame"); openSnakeGame.setFont(new Font("Arial",Font.BOLD,28));
        openSnakeGame.setForeground(new Color(0x000000)); openSnakeGame.setBackground(new Color(0x757675));
        openSnakeGame.setBorder(BorderFactory.createLineBorder(Color.black,1));
        openSnakeGame.addActionListener(this); openSnakeGame.setFocusable(false);
        // cube3d:
        bottomPanel.add(cubeOpen); cubeOpen.setText("Cube3d"); cubeOpen.setFont(new Font("Arial",Font.BOLD,28));
        cubeOpen.setForeground(new Color(0x000000)); cubeOpen.setBackground(new Color(0x757675));
        cubeOpen.setBorder(BorderFactory.createLineBorder(Color.black,1));
        cubeOpen.addActionListener(this); cubeOpen.setFocusable(false);
        // tictactoe:
        bottomPanel.add(tictactoe); tictactoe.setText("TicTacToe"); tictactoe.setFont(new Font("Arial",Font.BOLD,28));
        tictactoe.setForeground(new Color(0x000000)); tictactoe.setBackground(new Color(0x757675));
        tictactoe.setBorder(BorderFactory.createLineBorder(Color.black,1));
        tictactoe.addActionListener(this); tictactoe.setFocusable(false);



    }
    protected void labelSetup (){
        // Header :
        header.setText("Rec Rotating & GameHub");
        header.setFont(new Font("Arial",Font.BOLD,40));
        header.setForeground(new Color(0x333E3C));
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setVerticalAlignment(JLabel.CENTER);
        header.setHorizontalTextPosition(JLabel.CENTER);
        header.setVerticalTextPosition(JLabel.CENTER);
        topPanel.add(header);
        // RectangleLabel :
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Left Buttons :
        if(e.getSource()==left1){
            x += 45;
            System.out.println(x);

        }
        if(e.getSource()==left2){
            x += 90;
            System.out.println(x);
        }
        if(e.getSource()==left3){
            x += 180;
            System.out.println(x);
        }
        // Right Buttons :
        if(e.getSource()==right1){
            x -= 45;
            System.out.println(x);
        }
        if(e.getSource()==right2){
            x -= 90;
            System.out.println(x);
        }
        if(e.getSource()==right3){
            x -= 180;
            System.out.println(x);
        }
        if(e.getSource()==startButton){
            x = 0;
            System.out.println(x);
        }
        if(e.getSource()==openSnakeGame){
            new SnakeGame();
        }
        if(e.getSource()==cubeOpen){
            Cube3D cube1 = new Cube3D();
            cube1.setVisible(true);
        }
        if(e.getSource()==tictactoe){
            new TictactoeGame();
        }
    }
    // panels :
    JPanel leftPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    // Buttons :
      // left :
    JButton left1 = new JButton();
    JButton left2 = new JButton();
    JButton left3 = new JButton();
      // Right :
    JButton right1 = new JButton();
    JButton right2 = new JButton();
    JButton right3 = new JButton();
      // Start :
    JButton startButton = new JButton();
     // game:
    JButton openSnakeGame = new JButton();
    JButton cubeOpen = new JButton();
    JButton tictactoe = new JButton();
    // Labels :
    JLabel header = new JLabel();
    // Test :

}