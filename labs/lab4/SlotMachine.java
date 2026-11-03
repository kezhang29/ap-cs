import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SlotMachine {
    private int num1, num2, num3;
    private int winnings;
    private int balance;

    private BufferedImage slotMachineBufferedImage;

    public SlotMachine(int balance) {
        this.balance = balance;

        try {
            slotMachineBufferedImage = ImageIO.read(new File("./slot_machine.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void drawMachine(Graphics g) {
        g.drawImage(slotMachineBufferedImage, 100, 50, null);

        Graphics2D g2 = (Graphics2D) g;
        int width = ockBufferedImage.getWidth();   // returns the width of the image
        int height = rockBufferedImage.getHeight();  // returns the height of the image
       
        // adjust the width and height of the image using the g2 object
        g2.drawImage(rockBufferedImage,x, y, width/2, height/2,null);  // width and height will be cut in half

    }
    
}
