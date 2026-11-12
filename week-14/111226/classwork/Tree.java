import java.awt.Graphics;
import java.awt.Color;

public class Tree {
    private int x,y;
    
    public Tree(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawTree(Graphics g) {
            g.setColor(new Color(165, 42, 42));
            g.fillRect(x, y,35,50);
            g.setColor(Color.GREEN);
            g.fillOval(x+20,y-10,30,30);
            g.fillOval(x,y-25,30,30);
            g.fillOval(x-20,y-10,30,30);
    }
}
