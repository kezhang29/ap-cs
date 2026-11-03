import java.awt.Color;
import java.awt.Graphics;

public class MoveObjects{
    private int animalX,animalY, animalStartX;   
    private int cloudX, cloudY, cloudStartX; 
    private int sunX, sunY, sunStartY; 

    private Color flowerStemGreen, flowerMiddleOrange, flowerPetals;

    public MoveObjects(int animalX, int animalY, int cloudX, int cloudY, int sunX, int sunY) {
        this.animalX = animalX;
        this.animalY = animalY;
        this.animalStartX = animalX;
        this.cloudX = cloudX;
        this.cloudY = cloudY;
        this.sunX = sunX;
        this.sunY = sunY;

        flowerStemGreen = new Color(0, 153, 0);
        flowerMiddleOrange = new Color(204, 102, 0);
        flowerPetals = new Color(255,255,0);
    }

    public void drawScene(Graphics g) {
        drawBackground(g);
        drawBird(g);
        drawSun(g);
        drawCloud(g);
        for (int x = 0; x < 20; x++) {
            drawFlowers(g,60*x,1000);
        }
        for (int i = 0; i < 15; i++) {
            drawTrees(g, i*75+30);
        }
    }

    private void drawBackground(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0,0,1200,800);
        g.setColor(Color.GREEN);
        g.fillRect(0,800,1200,300);
    }

    private void drawBird(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawArc(animalX, animalY, 20, 12, 0, 180);
        g.drawArc(animalX + 18, animalY, 20, 12, 0, 180);
    }

    private void drawSun(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(sunX,sunY,75,75);
    }

    private void drawCloud(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(cloudX,cloudY, 50,50);
        g.fillOval(cloudX+30,cloudY, 50,50);
        g.fillOval(cloudX+15,cloudY-25, 50,50);
     }

     private void drawFlowers(Graphics g, int x, int y) {
        // Draws stem
        g.setColor(flowerStemGreen);
        g.fillRect(x,y,10,20);
        // Draw petals of flower
        g.setColor(flowerPetals);
        g.fillOval(x+7,y-10,8,8);
        g.fillOval(x-7,y-10,8,8);
        g.fillOval(x,y-15,8,8);
        g.fillOval(x,y-4,8,8);
        g.setColor(flowerMiddleOrange);
        g.fillOval(x-1,y-10,10,10);

    }

    private void drawTrees(Graphics g, int x) {
        g.setColor(new Color(165, 42, 42));
        g.fillRect(x, 750,35,50);
        g.setColor(Color.GREEN);
        g.fillOval(x-85,740,30,30);
        g.fillOval(x+20,740,30,30);
        g.fillOval(x,725,30,30);
    }
     

    public void animate() {
        moveBird();
        moveSun();
        moveCloud();
    } 

    private void moveBird() {
        if (animalX <= 800) {
            animalX += 2;
        } else {
            animalX = animalStartX;
        }
    }

    private void moveSun() {
        if (sunY <= 800) {
            sunY += 1;
        } else {
            sunY = sunStartY;
        }
    }

    private void moveCloud() {
        if (cloudX <= 800) {
            cloudX += 2;
        } else {
            cloudX = cloudStartX;
        }
    }
}
