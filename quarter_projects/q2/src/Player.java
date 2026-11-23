// package quarter_projects.q2.src;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;    
import java.awt.Dimension;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player {
    private BufferedImage[] playerUp, playerDown, playerRight, playerLeft;

    private int x,y;
    private int directionMoving;

    private int frame;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        frame = 0;

        playerUp = new BufferedImage[10];
        playerDown = new BufferedImage[10];
        playerRight = new BufferedImage[10];
        playerLeft = new BufferedImage[10];

        String[] animationNames = {"walk_up", "walk_down", "walk_right", "walk_left"};

        BufferedImage[][] animations = {playerUp, playerDown, playerRight, playerLeft};

        try  {
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j < animations.length; j++) {
                    String direction = animationNames[j].split("_")[1];
                    animations[j][i - 1] = ImageIO.read(new File("../assets/player/" + direction + "/" + animationNames[j] + "_" + i + ".png"));
                }
            }
        } catch (Exception e) {
            System.out.println("Image failed to load: " + e);
        }
    }

    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        int width = 450;   // returns the width of the image
        int height = 540;

        if (directionMoving == 0) {
            g2.drawImage(playerUp[frame], x, y, width / 8, height / 10, null);
        } else if (directionMoving == 1) {
            g2.drawImage(playerRight[frame], x, y, width / 9, height / 10, null);
        } else if (directionMoving == 2) {
            g2.drawImage(playerDown[frame], x, y, width / 9, height / 10, null);
        } else if (directionMoving == 3) {
            g2.drawImage(playerLeft[frame], x, y, width / 9, height / 10, null);
        }
    }

    public void moveRight() {
        frame = (frame + 1) % 6;
        if (x < 950) {
            x += 3;
        }
        directionMoving = 1;
    }

    public void moveLeft() {
        frame = (frame + 1) % 6;
        if (x > 0) {
            x -= 3;
        }
        directionMoving = 3;
    }

    public void moveUp() {
        frame = (frame + 1) % 6;
        if (y > 50) {
            y -= 3;
        }
        directionMoving = 0;
    }

    public void moveDown() {
        frame = (frame + 1) % 6;
        if (y < 950) {
            y += 3;
        }
        directionMoving = 2;
    }


}
