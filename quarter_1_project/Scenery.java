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
    private Color lakeBlue;
    private Color sidewalkOutlineGrey;
    private Color railingGrey1, railingGrey2, railingGrey3, railingGrey4, railingGrey5;

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
                g.fillRect(0,490,1200,165);

                g.setColor(sidewalkOutlineGrey);
                g.fillRect(0,660,1200,7);

                // Draw railings
                g.setColor(railingGrey5);
                g.fillRect(0, 600, 275, 10);
                g.fillRect(75, 600, 10, 57);

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
                }
                   
                
                
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
