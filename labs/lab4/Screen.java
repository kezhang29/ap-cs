import javax.swing.JPanel;

import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;


import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Screen extends JPanel implements KeyListener {
	// Slot machine and coins instance vairables
    SlotMachine slotMachine;
    Coin[] coins;
	// Initialization Constructor
	public Screen() {
        setFocusable(true);
        setLayout(null);

        // Set up KeyListening. requestFocusInWindow() directs focus to the current
        // (this) JPanel
        this.requestFocusInWindow();
        this.addKeyListener(this);

        // instantiate/initialize objects
        this.slotMachine = new SlotMachine(100);
	}


    //set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
	    return new Dimension(1000,1050);
	}
	
    // Paints all the objects
	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
        // Call the draw methods
        drawCoins(g);
        slotMachine.drawMachine(g);

	}

    public void animate() {
        // Before implementing this with AI's help, I had the old just moveCoins method in the main thread.
        // The problem with that were two threads, the main thread, which called animate() and 
        // the Swing EDT thread which checked for keyboard input and also ran paintComponent(). This meant that animate()
        // could use the coins array when none of its elements were non-null, which threw a crash for me. What the AI suggested
        // was to implement this bottom code which ran the block inside in the Swing EDT thread. 
        new javax.swing.Timer(10, e -> {
            moveCoins(20);
            repaint();
        }).start();
    }

    // Draws coins if the user actually won
    private void drawCoins(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (slotMachine.getWinnings() != 0) {
            for (Coin coin : coins) {
                coin.drawCoin(g2);
            }
        }
    }

    // Generates random coin positions and assigns a coin object for every element
    private void generateCoins(Coin[] coins) {
        int x, y;
        for (int i = 0; i < coins.length; i++) {
            x = (int) (Math.random() * 990);
            y = (int) (Math.random() * 250);
            coins[i] = new Coin(x, y);
        }
    }

    // Moves each coin down by a speed
    public void moveCoins(int speed) {
        if (slotMachine.getWinnings() != 0) {
            for (Coin coin : coins) {
                coin.moveCoin(speed);
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Triggers spin when spacebar is pressed
        if (e.getKeyCode() == 32) { 
            // Check if score is not below zero
            if (slotMachine.keepPlaying()) {
                slotMachine.play();
                int winnings = slotMachine.getWinnings();
                if (winnings > 0) {
                    // Case on winnings, the higher the winnings, the larger sized coin array initialized
                    if (winnings == 2) {
                        coins = new Coin[25];
                    } else if (winnings == 5) {
                        coins = new Coin[50];
                    } else if (winnings == 100) {
                        coins = new Coin[200];
                    }
                    generateCoins(coins);
                }
               
            }
        }
    }
    
    // Required KeyListener interface methods
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
	
}
