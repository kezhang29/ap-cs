import java.awt.Color;
import java.awt.Graphics;


public class Triangle {
    // Instance Variables
    private int x, y;
    private int[] xArray, yArray;
    private Color color;
    private int startX, startY;


    // Constructor
    public Triangle(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        xArray = new int[3];
        yArray = new int[3];
        startX = x;
        startY = y;
        this.color = color;
    }


    // Draw a Triangle
    public void drawTriangle(Graphics g) {
        // set the color
        g.setColor(color);


        // Set up the coordinate arrays
        xArray[0] = x;
        xArray[1] = x - 50;
        xArray[2] = x + 50;
        yArray[0] = y;
        yArray[1] = y + 100;
        yArray[2] = y + 100;
        // Draw the triangle
        g.fillPolygon(xArray, yArray, 3);
    }




    // Move a Triangle
    public void moveRight() {
        if (x>=800) {
            x = startX;;
        } else {
            x += 5;
        }
    }

    // Move a Triangle
    public void moveDown() {
        if (y>=400) {
            y = startY;;
        } else {
            y += 5;
        }
    }

}
