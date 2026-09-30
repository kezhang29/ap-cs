import javax.swing.JFrame;
import java.util.Scanner;

// Runner that can be used with JPanel Graphics
public class Runner {
    public static void main(String args[]) {

        // Create the frame object. Give it a title appropriate to the application
        JFrame frame = new JFrame("Cityscape");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a time of day, either day or night: ");
        String timeOfDay = sc.next();
        while (!(timeOfDay.equalsIgnoreCase("day") || timeOfDay.equalsIgnoreCase("night"))) {
           System.out.print("Please enter a valid response:");
           timeOfDay = sc.next();
        }
        System.out.print("Input a season, spring, fall, or winter: ");
        String season = sc.next();
        while (!(season.equalsIgnoreCase("spring") || season.equalsIgnoreCase("fall") || season.equalsIgnoreCase("winter"))) {
           System.out.print("Please enter a valid response:");
           season = sc.next();
        }
        // Create the JPanel object and add it to the frame
        Scenery canvas = new Scenery(timeOfDay, season);
        frame.add(canvas);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        sc.close();
    }
}
