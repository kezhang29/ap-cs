import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Coin {
    private int x,y, width, height;
    private BufferedImage coinBufferedImage;    

    public Coin(int x, int y) {
        this.x = x;
        this.y = y;

        try {
            coinBufferedImage = ImageIO.read(new File("./coin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        width = coinBufferedImage.getWidth();   // returns the width of the image
        height = coinBufferedImage.getHeight();

    }

    public void drawCoin(Graphics2D g) {
        g.drawImage(coinBufferedImage,x, y, width/9, height/9,null); 
    }

    public void moveCoin(int speed) {
        if (y <= 1100) {
            y += speed;
        } 
    }
}
