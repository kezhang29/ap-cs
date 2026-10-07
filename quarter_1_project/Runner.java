import javax.swing.JFrame;
import java.util.Scanner;

// Runner that can be used with JPanel Graphics
public class Runner {
    public static void main(String args[]) {

        // Instantiate JFrame object that will draw ShangHai Cityscape
        JFrame frame = new JFrame("Shanghai Cityscape");
        // Instantiate scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for time of day
        System.out.print("Please input a time of day, either day or night: ");
        String timeOfDay = sc.next();
        // Keep prompting user until they enter a valid response, day or night
        while (!(timeOfDay.equalsIgnoreCase("day") || timeOfDay.equalsIgnoreCase("night"))) {
           System.out.print("Please enter a valid response:");
           timeOfDay = sc.next();
        }
        // Ask user season
        System.out.print("Input a season, spring, fall, or winter: ");
        String season = sc.next();
        // Keep prompting user until they enter a valid response, spring, fall, or winter
        while (!(season.equalsIgnoreCase("spring") || season.equalsIgnoreCase("fall") || season.equalsIgnoreCase("winter"))) {
           System.out.print("Please enter a valid response:");
           season = sc.next();
        }
        // Initializes Scenery object with user inputs for timeOfDay and season
        Scenery canvas = new Scenery(timeOfDay, season);
        frame.add(canvas);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        sc.close();
    }
}
