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
    }

    @Override
    public Dimension getPreferredSize() {
        // Sets the size of the panel
        return new Dimension(1000, 600); // max size 1920 (width) by 1080 (height)
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

    // Make methods that are just called from within this class private
    private void drawBackground(Graphics g) {
        System.out.println(getWidth());
        System.out.println(getHeight());
         
        if (timeOfDay.equalsIgnoreCase("day")) {
            if (season.equalsIgnoreCase("spring")) {
                // Draw sky
                g.setColor(springBlue);
                g.fillRect(0,0,1000,600);
                // Draw Road
                g.setColor(roadGrey);
                g.fillRect(0,525,1000,200);
                g.setColor(roadOutline);
                g.fillRect(0,515,1000,10);

                g.setColor(roadLinesGrey);
                int[] xPoints1 = { 70, 210, 205, 65 };
                int[] yPoints1 = { 560, 560, 565, 565 };
                g.fillPolygon(xPoints1, yPoints1, 4);


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
}
