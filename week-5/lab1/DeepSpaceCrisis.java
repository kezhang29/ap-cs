import java.util.Scanner;

/**
 * This is a class that stimulates a deep space adventure in the command line
 * where the user can choose between two different question modes
 */
public class DeepSpaceCrisis {

    /**
     * Helper method that checks if an input string equals the intended
     * answer while ignoring case
     */
    public static boolean isCorrect(String answer, String correctAnswer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompts user to choose between two question modes
        System.out.print("Choose a mission stream, orbital or trivia: ");
        String selection = sc.next();

        // Counter that keeps track of user's correct reponses
        int correctResponses = 0;

        if (selection.equalsIgnoreCase("orbital")) {
            // Asks 3 easy orbital mechanics questions
            System.out.print("Artemis-9 is traveling at 7 km/s. How many kilometers does it travel in 10 seconds? ");
            if (isCorrect(sc.next(), "70")) {
                correctResponses += 1;
            }
            System.out.print("An asteroid has a mass of 500 kg and another has a mass of 300 kg. What is their combined mass? ");
            if (isCorrect(sc.next(), "800")) {
                correctResponses += 1;
            }
            System.out.print("If a thruster burns 5 liters of fuel per second, how many liters are burned in 12 seconds? ");
            if (isCorrect(sc.next(), "60")) {
                correctResponses += 1;
            }
            // Checks whether they user has answered the last 3 questions correctly
            boolean hardMode = (correctResponses == 3); 
            if (hardMode) {
                // If the user has answered all 3 correctly, gives 3 hard orbital mechanics problems
                System.out.print("Calculate the escape velocity factor: If base velocity is 11.2 and orbital drag is 2.5, find their sum (round to nearest int)? ");
                if (isCorrect(sc.next(), "14")) {
                    correctResponses += 1;
                }
                System.out.print("A small moon's gravity is 0.16 of Earth's (9.8 m/s²). What is the moon's gravitational acceleration? (Round to nearest int) ");
                if (isCorrect(sc.next(), "2")) {
                    correctResponses += 1;
                }
                System.out.print("If the radius of your orbit doubles, the orbital period increases by a factor of 2.83. If your current period is 5 hours, and the radius doubles, what is the new period (round to nearest int)? ");
                if (isCorrect(sc.next(), "14")) {
                    correctResponses += 1;
                }
            } else {
                // If the user has not answered all 3 correctly, keeps giving easy orbital mechancs problems
                System.out.print("The probe needs to complete a 360-degree orbit but has only turned 120 degrees. How many degrees are left? ");
                if (isCorrect(sc.next(), "240")) {
                    correctResponses += 1;
                }
                System.out.print("A communication signal takes 4 seconds to travel 1 unit of space distance. How long does it take to travel 8 units? ");
                if (isCorrect(sc.next(), "32")) {
                    correctResponses += 1;
                }
                System.out.print("Your ship has 4 auxiliary batteries. Each holds 25 units of power. What is the total auxiliary power available? ");
                if (isCorrect(sc.next(), "100")) {
                    correctResponses += 1;
                }
            }
        } else if (selection.equalsIgnoreCase("trivia")) {
             // Asks 3 easy alien trivia questions
            System.out.print("What color is the plasma core of the alien relay? A) Blue B) Green C) Neon Pink ");
            if (isCorrect(sc.next(), "A")) {
                correctResponses += 1;
            }
            System.out.print("The relay belongs to the 'Zul'Kari' Empire. What is their primary greeting? A) Peace B) Klah C) End Transmission ");
            if (isCorrect(sc.next(), "C")) {
                correctResponses += 1;
            }
            System.out.print("How many eyes do the relay technicians have? A) 1 B) 2 C) 3 ");
            if (isCorrect(sc.next(), "A")) {
                correctResponses += 1;
            }
            // Checks whether they user has answered the last 3 questions correctly
            boolean hardMode = (correctResponses == 3); 
            if (hardMode) {
                // If the user has answered all 3 correctly, gives 3 hard alien trivia problems
                System.out.print("Which hyper-dimensional frequency does the relay operate on? A) 4.2 GHz B) 14.2 GHz C) 104.7 GHz ");
                if (isCorrect(sc.next(), "70")) {
                    correctResponses += 1;
                }
                System.out.print("What is the formal title of the Alien Communication Overseer? A) Grand Arbiter B) Sub-Commander C) Prime Echo ");
                if (isCorrect(sc.next(), "800")) {
                    correctResponses += 1;
                }
                System.out.print("In the Year of First Contact (Zul'Kari Calendar 804), what sub-sector was declared neutral zone? A) Sector 4 B) Sector 9 C) Sector 12 ");
                if (isCorrect(sc.next(), "240")) {
                    correctResponses += 1;
                }
            } else {
                // If the user has not answered all 3 correctly, gives 3 easy alien trivia problems
                System.out.print("What element disrupts the alien transmission? A) Gold B) Iron C) Copper ");
                if (isCorrect(sc.next(), "C")) {
                    correctResponses += 1;
                }
                System.out.print("Artemis-9 is identifying the alien ship class. Is it a A) Fighter B) Cargo Pod C) Scout? ");
                if (isCorrect(sc.next(), "A")) {
                    correctResponses += 1;
                }
                System.out.print("The alien language uses binary code mixed with music notes. True or False? A) True B) False ");
                if (isCorrect(sc.next(), "A")) {
                    correctResponses += 1;
                }
            }
        } else {
            // Prints an unauthorized response message to the user if they did not choose one of the modes
            System.out.println("CRITICAL ERROR: Unauthorized stream selection. Aborting launch. ");
        }

         // Checks if the user entered either orbital or trivia before running the output user grade logic
        boolean validResponse = (selection.equalsIgnoreCase("orbital") || selection.equalsIgnoreCase("trivia"));

        if (validResponse) {
            // Prints fraction of problems done correctly
            System.out.println("Final Mission Score: " + correctResponses + "/6");
            // Assigns mission grade to the user
            if (correctResponses <= 2) {
                System.out.println("Grade F (Mission Failed - Ship lost in deep space).");
            } else if (correctResponses == 3) {
                System.out.println("Grade D (Critical Systems Damaged).");
            } else if (correctResponses == 4) {
                System.out.println("Grade C (Mission Sustained).");
            } else if (correctResponses == 5) {
                System.out.println("Grade B (Successful Orbit).");
            } else if (correctResponses == 6) {
                System.out.println("Grade A (Flawless Execution - Mission Aced).");
            }
        }
        
        sc.close();
    }
}