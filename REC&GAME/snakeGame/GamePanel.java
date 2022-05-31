package snakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 30;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 120;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int snakeSize = 5;
    int unitEating;
    int unitX;
    int unitY;
    char direction = 'D';
    boolean run = false;
    Timer timer;
    Random rand;
    GamePanel(){
            rand = new Random();
            this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
            this.setBackground(Color.BLACK);
            this.setFocusable(true);
            this.addKeyListener(new keyAdapter());
            start();
    }
    public void start(){
        newUnit();
        run = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
            if (run) {
                for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
                    g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
                    g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
                }
                g.setColor(new Color(0xD8FF00));
                g.fillOval(unitX, unitY, UNIT_SIZE, UNIT_SIZE);
                for (int i = 0; i < snakeSize; i++) {
                    if (i == 0) {
                        g.setColor(new Color(0x00FF89));
                        g.fillOval(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    } else {
                        g.setColor(new Color(0x00D208));
                        g.fillOval(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    }

                }
            } else {
                gameEnd(g);
            }

    }
    public void move(){
        for (int i = snakeSize; i > 0 ; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch(direction){
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }
    public void newUnit(){
        unitX = rand.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        unitY = rand.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }
    public void score(){
        if((x[0] == unitX)&&(y[0] == unitY)){
            snakeSize++;
            unitEating++;
            newUnit();
        }
    }
    public void collisionDetection(){
        for (int i = snakeSize; i > 0 ; i--) {
            if((x[0] == x[i])&&(y[0] == y[i])){
                run = false; // gameover.
            } // head
        }
        if(x[0] < 0){
            run = false; // left
        }
        if(x[0] > SCREEN_WIDTH){
            run = false; // right
        }
        if(y[0] < 0){
            run = false; // top
        }
        if(y[0] > SCREEN_HEIGHT){
            run = false; // bottom
        }
        if(!run){
            timer.stop();
        }

    }
    public void gameEnd(Graphics g){
        g.setColor(new Color(0x9621E0));
        g.setFont(new Font("Ariel",Font.BOLD, 75));
        FontMetrics fMetrics = getFontMetrics(g.getFont());
        g.drawString("GameOver",(SCREEN_WIDTH - fMetrics.stringWidth("GameOver"))/2,SCREEN_HEIGHT/2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if (run) {
                move();
                score();
                collisionDetection();
            }
            repaint();
    }
    public class keyAdapter extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e){
            switch(e.getKeyCode()){
                // left
                case KeyEvent.VK_A:
                    if(direction != 'R'){
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_LEFT:
                    if(direction != 'R'){
                        direction = 'L';
                    }
                    break;
                // right
                case KeyEvent.VK_D:
                    if(direction != 'L'){
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L'){
                        direction = 'R';
                    }
                    break;
                // up
                case KeyEvent.VK_W:
                    if(direction != 'D'){
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'D'){
                        direction = 'U';
                    }
                    break;
                // down
                case KeyEvent.VK_S:
                    if(direction != 'U'){
                        direction = 'D';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction != 'U'){
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}
