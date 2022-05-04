package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import object.OBJ_Key;

public class UI {
	GamePanel gp;
	Font calibri_40;
	BufferedImage keyImage;
	public boolean messageOn = false;
	public String message = "";
	int messageCounter = 0;
	public boolean gameEnd = false;
	public UI(GamePanel gp) {
		this.gp = gp;
		calibri_40 = new Font("Calibri",Font.BOLD, 30);
		OBJ_Key key = new OBJ_Key();
		keyImage = key.image;
	}
	public void showMessage(String message) {
		this.message = message;
		messageOn = true;
		
	}
	public void draw(Graphics2D g2) {
		
		if(gameEnd == true) {
			
			g2.setFont(calibri_40);
			g2.setFont(g2.getFont().deriveFont(200F));
			g2.setColor(Color.yellow);
			String text;
			int textLenght;
			text = "Congrats!";
			textLenght = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			int x = gp.screenWidth/2 - textLenght/2;
			int y = gp.screenHeight/2 - (gp.tileSize*3);
			g2.drawString(text, x, y);
			
			gp.gameThread = null;
		
		} 
		else {
			g2.setFont(calibri_40);
			g2.setColor(Color.black);
			g2.drawImage(keyImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null );
			g2.drawString("Key = " + gp.player.hasKey, 80, 60);
			if(messageOn == true) {
				g2.setFont(g2.getFont().deriveFont(50F));
				g2.drawString(message, 250, 500);
				messageCounter++;
				if(messageCounter > 120) {
					messageCounter = 0;
					messageOn = false;
				}
			}
		}
	}
}
