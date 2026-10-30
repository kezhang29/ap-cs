import java.awt.Color;
import java.awt.Graphics;

public class Scenery{
    private int animalX,animalY, animalStartX;   
    private int cloudX, cloudY, cloudStartX; 
    private int sunX, sunY, sunStartY; 

    public Scenery(int animalX, int animalY, int cloudX, int cloudY, int sunX, int sunY) {
        this.animalX = animalX;
        this.animalY = animalY;
        this.animalStartX = animalX;
        this.cloudX = cloudX;
        this.cloudY = cloudY;
        this.sunX = sunX;
        this.sunY = sunY;
    }

    public void drawScene(Graphics g) {
        drawBird(g);
        drawSun(g);
    }

    public void drawBird(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawArc(animalX, animalY, 20, 12, 0, 180);
        g.drawArc(animalX + 18, animalY, 20, 12, 0, 180);
    }

    public void drawSun(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(sunX,sunY,75,75);
    }

    public void animate() {
        moveBird();
        moveSun();
    } 

    public void moveBird() {
        if (animalX <= 800) {
            animalX += 2;
        } else {
            animalX = animalStartX;
        }
    }

    public void moveSun() {
        if (sunY <= 800) {
            sunY += 1;
        } else {
            sunY = sunStartY;
        }
    }
}
