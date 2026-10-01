// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Scenery extends JPanel {  
    private String timeOfDay;
    private String season;

    private Color springBlue;
    private Color roadGrey; 
    private Color roadOutline;
    private Color roadLinesGrey;
    private Color sideWalkWhite;
    private Color sideWalkLinesWhite;
    private Color lakeBlue, lakeOutlineBlue;
    private Color sidewalkOutlineGrey;
    private Color railingGrey1, railingGrey2, railingGrey3, railingGrey4, railingGrey5;
    private Color cityGroundGrey;
    private Color towerBeige;
    private Color towerPurple1, towerPurple2, towerPurple3, towerPurple4;
    private Color towerGrey;
    private Color towerBottomGrey;
    private Color towerTopGrey;
    private Color towerTopDarkerGrey;

    public Scenery(String timeOfDay, String season) {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we
                            // start using buttons.
        setLayout(null); // setting to null allows you to control the layout of the JPanel.

        this.timeOfDay = timeOfDay;
        this.season = season;

        springBlue = new Color(111, 197, 251);
        roadGrey = new Color(68, 72, 89);
        roadOutline = new Color(95, 100, 125);
        roadLinesGrey = new Color(140, 142, 157);
        sideWalkWhite = new Color(215, 207, 206);
        sideWalkLinesWhite = new Color(200, 193, 193);
        lakeBlue = new Color(93, 191, 252);
        sidewalkOutlineGrey = new Color(176, 170, 177);
        railingGrey1 = new Color(191, 184, 186);
        railingGrey2 = new Color(144, 144, 162);
        railingGrey3 = new Color(215, 205, 205);
        railingGrey4 = new Color(194, 186, 187);
        railingGrey5 = new Color(42, 60, 93);
        lakeOutlineBlue = new Color(79, 171, 217);
        cityGroundGrey = new Color(201, 199, 203);
        towerBeige = new Color(244, 221, 195);
        towerPurple1 = new Color(249, 140, 199);
        towerPurple2 = new Color(166, 64, 151);
        towerPurple3 = new Color(236, 88, 162);
        towerPurple4 = new Color(219, 86, 157);
        towerGrey = new Color(132, 132, 169);
        towerBottomGrey = new Color(115, 128, 171);
        towerTopGrey = new Color(129, 132, 160);
        towerTopDarkerGrey = new Color(130, 136, 165);


    }

    @Override
    public Dimension getPreferredSize() {
        // Sets the size of the panel
        return new Dimension(1200, 800); // max size 1920 (width) by 1080 (height)
    }

    /*
     * Call all of your drawing methods from paintComponent(Graphics). You must pass
     * the Graphics reference variable, g, to your
     * draw methods.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // DO NOT REMOVE THIS LINE
        // Create a method for each item that you draw
        drawBackground(g);
    }

    private void drawBackground(Graphics g) {
        System.out.println(getWidth());
        System.out.println(getHeight());
         
        if (timeOfDay.equalsIgnoreCase("day")) {
            if (season.equalsIgnoreCase("spring")) {
                // Draw sky
                g.setColor(springBlue);
                g.fillRect(0,0,1200,800);
                // Draw Road
                g.setColor(roadGrey);
                g.fillRect(0,725,1200,200);
                g.setColor(roadOutline);
                g.fillRect(0,715,1200,10);
                // Draw Road Lines
                g.setColor(roadLinesGrey);
                drawParallelogram(g, 70, 760, 140, 5, 5, roadLinesGrey, false);
                g.fillRect(525,760,130,5);
                drawParallelogram(g, 990, 760 , 140, 5, -5, roadLinesGrey, false);

                // Draw sidewalk
                g.setColor(sideWalkWhite);
                g.fillRect(0,650,1200,65);

                for (int i = 0; i < 13; i++) {
                    drawParallelogram(g, 45+ 90 * i,715, 3, 50,30 - 5 * i,sideWalkLinesWhite, false);
                }

                g.setColor(lakeBlue);
                g.fillRect(0,485,1200,170);

                g.setColor(sidewalkOutlineGrey);
                g.fillRect(0,660,1200,7);

                // Draw railings
                g.setColor(railingGrey5);
                g.fillRect(0, 600, 275, 10);
                g.fillRect(60, 600, 10, 57);
                g.fillRect(0, 618, 275, 5);
                g.fillRect(0, 632, 275, 5);
                for (int i = 0; i < 4; i++) {
                    g.fillRect(145 + 275 * i,600,65,58);
                }

                for (int i = 0; i < 4; i ++) {
                    g.setColor(railingGrey1);
                    g.fillRect(150 + 275 * i,645,50,15);
                    drawParallelogram(g, 200 + 275 * i, 660, 5, 15, 5,railingGrey2, true);
                    drawParallelogram(g, 150 + 275 *i, 645, 50, 5, 5,railingGrey3, false);
                    g.setColor(railingGrey4);
                    g.fillRect(154+275*i, 590, 47, 52);

                    g.setColor(railingGrey5);
                    g.fillRect(200 + 275 * i, 600, 275, 10);
                    g.fillRect(315+275*i, 600, 10, 57);
                    g.fillRect(205 + 275 *i, 618, 275, 5);
                    g.fillRect(205 + 275 *i, 632, 275, 5);
                }

                g.setColor(lakeOutlineBlue);
                g.fillRect(0,475,1200,10);
                g.setColor(cityGroundGrey);
                g.fillRect(0,465,1200,10);

                drawOrientalPearlTower(g);
                   
                
                
            } else if (season.equalsIgnoreCase("fall")) {

            } else if (season.equalsIgnoreCase("winter")) {

            }
        } else if (timeOfDay.equalsIgnoreCase("night")) {
            if (season.equalsIgnoreCase("spring")) {

            } else if (season.equalsIgnoreCase("fall")) {

            } else if (season.equalsIgnoreCase("winter")) {

            }
        }
    }

    private void drawOrientalPearlTower(Graphics g) {
        g.setColor(towerTopDarkerGrey);
        g.fillRect(316,35,7,40);

        g.setColor(towerBeige);
        g.fillRect(310, 130,20,30);

        g.setColor(towerBeige);
        g.fillRect(300,190,15,160);
        g.fillRect(325,190,15,160);
        drawParallelogram(g, 255, 465, 15, 60, 30, towerBeige, false);
        drawParallelogram(g, 370, 465, 15, 60, -30, towerBeige, false);
        g.setColor(towerPurple1);
        g.fillOval(280,340,80,80);
        g.setColor(towerGrey);
        g.fillArc(280,360,80,60,180,180);
        g.setColor(towerPurple2);
        g.fillRoundRect(280,375,80,20,10,10);
        g.setColor(towerBeige);
        g.fillRoundRect(300, 415, 15, 52, 10, 10);
        g.fillRoundRect(325, 415, 15, 52, 10, 10);

        g.setColor(towerPurple3); 
        for (int i = 0; i < 4; i++) {
            g.fillOval(312,310- 30 * i,15,15);
        }

        g.setColor(towerPurple1);
        g.fillOval(285,150,70,70);
        g.setColor(towerGrey);
        g.fillArc(285,155,70,65,180,180);
        g.setColor(towerPurple2);
        g.fillRoundRect(285,180,68,20,10,10);
        g.setColor(towerBottomGrey);
        g.fillRect(312,415,15,50);
        g.setColor(towerPurple2);
        g.fillRoundRect(310, 128, 20, 7, 5, 5);
        
        g.setColor(towerTopGrey);
        g.fillRect(313,90,13,38);

        g.setColor(towerPurple4);
        g.fillOval(308,70,22,22);

        g.setColor(towerPurple4);
        g.fillOval(314,30,10,10);

        g.setColor(towerPurple4);
        g.fillRect(317, 0,5,31);

    }

    private void drawBuilding(Graphics g, int x, int y) {
        
    }

    // Helper method that makes drawing a paralleogram easier
    private void drawParallelogram(Graphics g, int x1, int y1, int width, int height, int slope, Color color, boolean flipped) {
        g.setColor(color);
        if (flipped) {
            int[] xPoints = { x1, x1 + width, x1 + width, x1 };
            int[] yPoints = { y1, y1-slope, y1 - slope - height, y1 - height };
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        } else {
            int [] xPoints = { x1, x1 + width, x1 + width + slope, x1 + slope };
            int [] yPoints = { y1, y1, y1 - height, y1 - height };
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        }
    }
}
