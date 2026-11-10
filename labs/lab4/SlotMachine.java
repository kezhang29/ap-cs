import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Font;

public class SlotMachine {
    private int num1, num2, num3;
    private int winnings;
    private int balance;

    private BufferedImage slotMachineBufferedImage;
    private BufferedImage coinBufferedImage;

    public SlotMachine(int balance) {
        this.balance = balance;
        try {
            slotMachineBufferedImage = ImageIO.read(new File("./slot_machine.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void drawMachine(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int width = slotMachineBufferedImage.getWidth();   // returns the width of the image
        int height = slotMachineBufferedImage.getHeight();  // returns the height of the image
       
        // adjust the width and height of the image using the g2 object
        g2.drawImage(slotMachineBufferedImage,75, 50, width*2, height*2,null);  // width and height will be cut in half

        g2.setFont(new Font(Font.SERIF,Font.BOLD,115));
        g2.drawString(String.valueOf(num1), 330, 605);
        g2.drawString(String.valueOf(num2), 465, 605);
        g2.drawString(String.valueOf(num3), 600, 605);

        g2.setFont(new Font(Font.SERIF,Font.BOLD,25));
        g2.drawString("Balance: " + String.valueOf(balance), 815,40);

        drawPayout(g);
    }

    private void drawPayout(Graphics g) {
        g.setFont(new Font(Font.SERIF,Font.BOLD,25));
        g.drawString("7 7 7 = 100 points", 30, 45);
        g.drawString("3 of a kind = 5 points", 30, 75);
        g.drawString("2 of a kind = 2 points", 30,105);
    }

    public void play() {
        balance -= 1;
        winnings = 0;

        num1 = (int)(Math.random() * 9) + 1;
        num2 = (int)(Math.random() * 9) + 1;
        num3 = (int)(Math.random() * 9) + 1;

        if ((num1 == 7) && (num2 == 7) && (num3 == 7)) {
            winnings = 100;
        } else if ((num1 == num2) && (num1 == num3) && (num2 == num3)) {
            winnings = 5;
        } else if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
            winnings = 2;
        }
        balance += winnings;
    }

    public boolean keepPlaying() {
        return balance > 0;
    }
    
}
