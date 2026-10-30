import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Instantiate a pet object
        Pet petObj = new Pet("Kevinon", "Dragon", 30, 70, false);
        // Instantiate a scanner object
        Scanner sc = new Scanner(System.in);
       
        // Initialize a variable that keeps track of user's choice
        int choice = 0;
        // Checks user input and excutes corresponding action, exits loop if user inputs 0
        do {
            System.out.println("What do you want to do with your pet?");
            // Print choices
            System.out.print("""
            0) Exit 
            1) Take your pet for a walk
            2) Feed your pet
            3) Play with your pet
            4) Wake up your pet or have your pet go to sleep
            5) Get the status of your pet
            6) Take your pet to the vet
            Your choice:""" + " ");
            // Get user choice
            choice = sc.nextInt();
            if (choice == 1) {
                // Take pet on a walk if user chose the first choice
                System.out.println("You chose to take your pet on a walk.");
                System.out.print("How long do you want to walk your pet (1-5 miles): ");
                int miles = sc.nextInt();
                petObj.goOnWalk(miles);
            } else if (choice == 2) {
                // Feed pet if user chose choice 2
                System.out.println("You chose to feed your pet.");
                System.out.print("How much food do you want to feed your pet (integer between 3-10): ");
                int amountOfFood = sc.nextInt();
                petObj.feed(amountOfFood);
            } else if (choice == 3) {
                // Play with pet if user chose choice 3
                System.out.println("You chose to play with your pet.");
                System.out.print("How long do you want to play with your pet (10-20 mins)?: ");
                int timeMinutes = sc.nextInt();
                petObj.play(timeMinutes);
            } else if (choice == 4) {
                // Toggle sleep of pet if user chose choice 4
                System.out.println("You chose to toggle the sleep of the pet.");
                petObj.toggleSleep();
            } else if (choice == 5) {
                // Print status of pet if user chose choice 5
                System.out.println(petObj.getStatus());
            } else if (choice == 6) {
                // Visit vet if user chose choice 6
                System.out.println("You chose to visit the vet with your pet.");
                System.out.print("Input a number that represents the severity of the visity (1-5): ");
                int severity = sc.nextInt();
                petObj.vetVisit(severity);
            }

            // Check if pet needs care and warn the user if they do
            if (petObj.needsCare()) {
                System.out.println("Your pet needs immediate care!");
            }
        } while (choice != 0);

        sc.close();
    }
}
