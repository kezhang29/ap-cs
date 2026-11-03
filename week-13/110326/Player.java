import java.awt.Color;
import java.awt.Graphics;


public class Player{


	// location of the player and colors
	private int x, y;
	private Color orange;
	private Color green;


	public Player(int x, int y){
		// set up instance variables
		this.x = x;
		this.y = y;
		orange = new Color(255, 165, 0);
		green = new Color(0, 255, 0);
		
	}
	
	// draw the player
	public void draw(Graphics g) {
		g.setColor(orange);
		g.fillOval(x, y, 50, 50);
		g.setColor(green);
		g.fillRect(x-5, y+50, 60, 70);
	}

    public void moveRight(int speed) {
        if (x < 735) {
            x += speed;
        }
    }

    public void moveLeft(int speed) {
        if (x > 0) {
            x -= speed;
        }
    }

    public void moveUp(int speed) {
        if (y > 0) {
            y -= speed;
        }
    }

    public void moveDown(int speed) {
        if (y < 480) {
            y += speed;
        }
    }
}
	
	
