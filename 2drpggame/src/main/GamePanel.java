package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import entity.Player;
import object.SuperObject;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable{
	
	
	private static final long serialVersionUID = 1L;
	// setting up screen :
	final int originalTileSize = 16; // 16x16
	final int scale = 3;
	public final int tileSize = originalTileSize * scale; // 48x48
	public final int maxScreenCol = 16;
	public final int maxScreenRow = 12;
	public final int screenWidth = tileSize * maxScreenCol; // 768px
	public final int screenHeight = tileSize * maxScreenRow; // 576px
	// world map settings :
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;
	// Not used yet delete :
	public final int worldWidth = tileSize * maxWorldCol;
	public final int worldHeight = tileSize * maxWorldRow;
	// FPS :
	int FPS = 60;
	// Tile manager :
	TileManager tileM = new TileManager(this);
	// Collision :
	public CollisionCheck cChecker = new CollisionCheck(this); 
	// KeyHandler :
	KeyHandler keyHandler = new KeyHandler();
	// Sound class :
	Sound sound = new Sound();
	Sound soundEffect = new Sound();
	// UI :
	public UI ui = new UI(this);
	// Asset placer :
	public AssetSetter aSetter = new AssetSetter(this);
	// thread for time :
		Thread gameThread;
	// Initializing player :
	public Player player = new Player(this,keyHandler);
	// Object :
	public SuperObject obj[] = new SuperObject[10];
	// constructor :
	public GamePanel () {
		
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); // double buffering already enabled.
		this.addKeyListener(keyHandler);
		this.setFocusable(true);
	}
	public void setupGame() {
		
		aSetter.setObject();
		
		// playMusic(index); i will ad later.
	}
	// Start and Stop : 
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start(); // calling run method.
	}
	public void stopGameThread() {
		
	}
	@Override
	public void run() {
		// Time Set :
		double drawInterval = 1000000000/FPS; // 0.01666 Second.
		double nextDrawTime = System.nanoTime() + drawInterval;
		// main game loop :
		while(gameThread != null) { // as long as gameThread exists it loops.
			// update: updates information such as char position
			update();
			// frame: draws the screen with the updated info.
			repaint(); // classic calling the method paint component.
			// Sleep Method :
			try {
				double remainingTime = nextDrawTime - System.nanoTime();
				remainingTime = remainingTime/1000000;
				if(remainingTime < 0) {
					remainingTime = 0; // Means it doesn't need to sleep.
				}
				Thread.sleep((long) remainingTime);
				nextDrawTime += drawInterval;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	// Update :
	public void update() {
		player.update();
		
	}
	// Frame :
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		// Tiles :
		tileM.draw(g2);
		// Objects :
		for (int i = 0; i < obj.length; i++) {
			if(obj[i] != null) {
				obj[i].draw(g2, this);
			}
		}
		// Player :
		player.draw(g2);
		// UI :
		ui.draw(g2);
		
		g2.dispose();
	}
	public void playMusic(int index) {
		sound.setFile(index);
		sound.play();
		sound.loop();
	}
	public void stopMusic() {
		sound.stop();
	}
	public void playSoundEffect(int index) {
		soundEffect.setFile(index);
		soundEffect.play();
	}

}
