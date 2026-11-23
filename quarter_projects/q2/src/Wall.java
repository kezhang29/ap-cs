// package quarter_projects.q2.src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Wall {
    private int x,y, width, height;

    private Color wallColor;

    public Wall(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        wallColor = new Color(59, 82, 109);
    }

    public void drawWall(Graphics g) {
        g.setColor(wallColor);
        g.fill3DRect(x, y,width,height,false);
    }



}
