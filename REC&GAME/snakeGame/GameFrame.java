package snakeGame;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class GameFrame extends JFrame {

    GameFrame() {
        GamePanel snakePanel = new GamePanel();

        this.add(snakePanel);
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }
}
