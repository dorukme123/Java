package entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity{
	
	GamePanel gp;
	KeyHandler keyHandler;
	
	public final int screenX;
	public final int screenY;
	public int hasKey = 0;
	// Constructor :
	public Player(GamePanel gp, KeyHandler keyHandler) {
		this.gp = gp;
		this.keyHandler = keyHandler;
		screenX = gp.screenWidth/2 - gp.tileSize/2; // return halfway point.
		screenY = gp.screenHeight/2 - gp.tileSize/2;
		
		solidArea = new Rectangle(); // for player collision.
		solidArea.x = 8;
		solidArea.y = 16;
		solidAreaDefaultX = solidArea.x; // object collision.
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 32;
		solidArea.height = 32;
		
		setDefaultValues();
		getPlayerImage();
	}
	public void setDefaultValues() {
		worldX = gp.tileSize * 23;
		worldY = gp.tileSize * 21;
		speed = 4;
		direction = "down";
	}
	public void getPlayerImage() {
		try {
			up1 = ImageIO.read(getClass().getResourceAsStream("/player/mage_up_1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/player/mage_up_2.png"));
			up3 = ImageIO.read(getClass().getResourceAsStream("/player/mage_up_3.png"));
			up4 = ImageIO.read(getClass().getResourceAsStream("/player/mage_up_4.png"));
			down1 = ImageIO.read(getClass().getResourceAsStream("/player/mage_down_4.png")); // down 1'i kullanma kucuk kaliyo.
			down2 = ImageIO.read(getClass().getResourceAsStream("/player/mage_down_2.png"));
			down3 = ImageIO.read(getClass().getResourceAsStream("/player/mage_down_3.png"));
			down4 = ImageIO.read(getClass().getResourceAsStream("/player/mage_down_4.png"));
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/mage_left_1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/mage_left_2.png"));
			left3 = ImageIO.read(getClass().getResourceAsStream("/player/mage_left_3.png"));
			left4 = ImageIO.read(getClass().getResourceAsStream("/player/mage_left_4.png"));
			right1 = ImageIO.read(getClass().getResourceAsStream("/player/mage_right_1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/mage_right_2.png"));
			right3 = ImageIO.read(getClass().getResourceAsStream("/player/mage_right_3.png"));
			right4 = ImageIO.read(getClass().getResourceAsStream("/player/mage_right_4.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void update() {
		if(keyHandler.upPressed == true || keyHandler.downPressed == true || keyHandler.leftPressed == true || keyHandler.rightPressed == true) {
		// Movement :
			if(keyHandler.upPressed == true) {
				direction = "up";
			}
			else if(keyHandler.downPressed == true) {
				direction = "down";			
			}
			else if(keyHandler.leftPressed == true) {
				direction = "left";	
			}
			else if(keyHandler.rightPressed == true) {
				direction = "right";	
			}
			// tile collision checker :
			collisionOn = false;
			gp.cChecker.checkTile(this);
			// check object collision :
			int objIndex = gp.cChecker.checkObject(this, true);
			pickUpObj(objIndex);
			// if false player can't move :
			if(collisionOn == false) {
				switch(direction) {
				case"up":
					worldY -= speed;
					break;
				case"down":
					worldY += speed;
					break;
				case"left":
					worldX -= speed;
					break;
				case"right":
					worldX += speed;
					break;
				}
			}
			spriteCounter++;
			if(spriteCounter > 15) {
				if(spriteNum == 1) {
					spriteNum = 2;
				}
				else if (spriteNum == 2) {
					spriteNum = 3;
				}
				else if (spriteNum == 3) {
					spriteNum = 4;
				}
				else if (spriteNum == 4) {
					spriteNum = 1;
				}
				spriteCounter = 0;
			}
		}
	}
	public void pickUpObj(int index) {
		if(index != 999) {
			String objectName = gp.obj[index].name;
			switch (objectName) {
			case "Key":
				gp.playSoundEffect(0);
				hasKey++;
				gp.obj[index] = null; // deletes the ley.
				gp.ui.showMessage("Key Obtained!");
				break;
			case "Door":
				if(hasKey > 0) {
					gp.playSoundEffect(3);
					gp.obj[index] = null;
					hasKey--;
					gp.ui.showMessage("Door Opened!");
				} else {
					gp.playSoundEffect(2);
					gp.ui.showMessage("   Key 0!");
					}
				gp.playSoundEffect(2);
				System.out.println("Keys: " + hasKey);
				break;
			case "Boot":
				gp.playSoundEffect(1);
				gp.obj[index] = null;
				speed += 2;
				gp.ui.showMessage("PowerUP!");
				break;
			case "Chest":
				gp.ui.gameEnd = true;
				gp.playSoundEffect(4);
				break;
			}
		}
	}
	public void draw(Graphics2D g2) {
		// Draw player :
		BufferedImage image = null;
		switch(direction) {
		case "up":
			if(spriteNum == 1) {
				image = up1;
			}
			if(spriteNum == 2) {
				image = up2;
			}
			if(spriteNum == 3) {
				image = up3;
			}
			if(spriteNum == 4) {
				image = up4;
			}
			break;
		case "down":
			if(spriteNum == 1) {
				image = down1;
			}
			if(spriteNum == 2) {
				image = down2;
			}
			if(spriteNum == 3) {
				image = down3;
			}
			if(spriteNum == 4) {
				image = down4;
			}
			break;
		case "left":
			if(spriteNum == 1) {
				image = left1;
			}
			if(spriteNum == 2) {
				image = left2;
			}
			if(spriteNum == 3) {
				image = left3;
			}
			if(spriteNum == 4) {
				image = left4;
			}
			break;
		case "right":
			if(spriteNum == 1) {
				image = right1;
			}
			if(spriteNum == 2) {
				image = right2;
			}
			if(spriteNum == 3) {
				image = right3;
			}
			if(spriteNum == 4) {
				image = right4;
			}
			break;
		}
		g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
	}
}
