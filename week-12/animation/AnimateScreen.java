import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


// This code will move a rectangle across the screen, left to right
public class AnimateScreen extends JPanel {


    // Instance variables
    Triangle triangleOne, triangleTwo;
    // Constructor
    public AnimateScreen() {
       setFocusable(true);
       setLayout(null);

        this.triangleOne = new Triangle(25, 40, new Color(120, 45, 63));
        this.triangleTwo = new Triangle(25, 200, new Color(70, 10, 210));
    }


    // Set the dimension of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}


    // Call methods that will draw on the JPanel
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

        triangleOne.drawTriangle(g);
        triangleTwo.drawTriangle(g);
       
	}
    
    /* This runs until you exit your JPanel. A try catch exception handler is needed in case
       an exception is thrown during the pause. Copy this code exactly as is. You will add calls to your methods 
       that move your objects. */
    public void animate(){
        while(true){
            //pause for .01 second
            try {
                Thread.sleep(10);    // 10 milliseconds
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            // Add the code that "moves" your objects here. 
            triangleOne.moveRight();
            triangleTwo.moveDown();

            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
}
