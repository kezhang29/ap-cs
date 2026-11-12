import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


// This class creates and draws a rainy day scene on a JPanel
public class Screen extends JPanel implements KeyListener{


	// Declare a Raindrop object
	private Raindrop[] rainDrops;
    private boolean raining;
	private Tree[] trees;

	public Screen() {
        setLayout(null);
        setFocusable(true);
        addKeyListener(this);
        raining = false;
		

		// instantiate the Raindrop object
        rainDrops = new Raindrop[100];
		// Instantiate an array of Tree objects
		trees = new Tree[10];
        // Instantiate the Raindrop elements
        int x,y;
        for (int i = 0; i < rainDrops.length; i++) {
            x = (int)(Math.random()*790);
            y = (int) (Math.random() * 590);
            rainDrops[i] = new Raindrop(x,y);
        }
		for (int j = 0; j < trees.length; j++) {
			x = (int)(Math.random()*770);
			y = (int)(Math.random()*70) + 480;
			trees[j] = new Tree(x,y);
		}
	}
	
	// JPanel method that sets the size of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}


	// JPanel method that invokes methods that draw on the JPanel
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.BLUE);
		g.fillRect(0,0,800,600);
		g.setColor(new Color(1, 50, 32)); 
		g.fillRect(0,400,800,200);

		drawForest(g);	
		// draw the rain
		if (raining) {
			for (Raindrop drop : rainDrops) {
				drop.drawRaindrop(g);
			}
		}
		
		
	}
	// Method runs continuously to simulate object movement
	public void animate(){
		while(true){
			//wait for .01 second
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			// Add move methods here
            if (raining) {
                for (Raindrop drop : rainDrops) {
                    drop.moveRaindrop();
                }
            }
			//repaint the graphics drawn
			repaint();
		}
	}

	public void drawForest(Graphics g) {
		for (Tree tree : trees) {
			tree.drawTree(g);
		}
	}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 32) {
            raining = !raining;
        }
    }
	
    @Override
    public void keyReleased(KeyEvent e) {}
	
    @Override
    public void keyTyped(KeyEvent e) {}
	
}
