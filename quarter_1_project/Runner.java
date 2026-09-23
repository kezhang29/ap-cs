import javax.swing.JFrame;
import java.util.Scanner;

// Runner that can be used with JPanel Graphics
public class Runner {
    public static void main(String args[]) {

        // Create the frame object. Give it a title appropriate to the application
        JFrame frame = new JFrame("Cityscape");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input day or night: ");
        String timeOfDay = sc.next();
        // Create the JPanel object and add it to the frame
        Scenery canvas = new Scenery(timeOfDay);
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
