import java.util.Scanner;

// This class runs the formula calculator
public class Runner {
    public static void main(String[] args) {
        // Instantiates a scanner object to read user input
        Scanner sc = new Scanner(System.in);       
        // Instantiates a formula object to calculate formulas
        Formulas formulas = new Formulas();

        System.out.println("Welcome to a formula calculator!");
        // Prints out the 15 formulas the user can choose
        System.out.println("Enter an integer to the formula you want to calculate: \n" + 
        "1. Triangle Area \n" + 
        "2. Rectangle Area \n" +
        "3. Square Area \n" + 
        "4. Trapezoid Area \n" + 
        "5. Sphere Volume \n" + 
        "6. Cone Volume \n" + 
        "7. Cube Volume \n" +
        "8. Rectangular Prism Volume \n" + 
        "9. Pythagorean Theorem \n" +
        "10. Distance between Two Points \n" +
        "11. Weight on Earth \n" +
        "12. Gravitational Potential Energy \n" + 
        "13. Kinetic Energy \n" + 
        "14. Average Speed \n" + 
        "15. Force Calculation \n");
        System.out.print("Your choice (an integer 1-15): ");

        int choice = sc.nextInt();
        // If the user chooses choice 1, calculate triangle area
        if (choice == 1) {
            System.out.println("You chose Triangle Area.");
            System.out.print("Enter base: ");
            int base = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();
            formulas.triangleArea(base, height);
        // If the user chooses choice 2, calculate triangle area
        } else if (choice == 2) {
            System.out.println("You chose Rectangle Area.");
            System.out.print("Enter length: ");
            int length = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();
            formulas.rectArea(length, height);
        // If the user chooses choice 3, calculate square are
        } else if (choice == 3) {
            System.out.println("You chose Square Area.");
            System.out.print("Enter side length: ");
            int sideLength = sc.nextInt();
            formulas.squareArea(sideLength);
        // If the user chooses choice 4, calculate triangle area
        } else if (choice == 4) {
            System.out.println("You chose Trapezoid Area.");
            System.out.print("Enter bottom base: ");
            int bottomBase = sc.nextInt();
            System.out.print("Enter top base: ");
            int topBase = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();
            formulas.trapezoidArea(bottomBase, topBase, height);
        // If the user chooses choice 5, calculate sphere volume
        } else if (choice == 5) {
            System.out.println("You chose Sphere Volume.");
            System.out.print("Enter radius: ");
            int radius = sc.nextInt();
            formulas.sphereVolume(radius);
        // If the user chooses choice 6, calculate cone volume
        } else if (choice == 6) {
            System.out.println("You chose Cone Volume.");
            System.out.print("Enter radius: ");
            int radius = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();
            formulas.coneVolume(radius, height);
        // If the user chooses choice 7, calculate cube volume
        } else if (choice == 7) {
            System.out.println("You chose Cube Volume.");
            System.out.print("Enter side length: ");
            int side = sc.nextInt();
            formulas.cubeVolume(side);
        // If the user chooses choice 8, calculate rectangular prism volume
        } else if (choice == 8) {
            System.out.println("You chose Rectangular Prism Volume.");
            System.out.print("Enter length: ");
            int length = sc.nextInt();
            System.out.print("Enter width: ");
            int width = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();
            formulas.rectPrismVolume(length, width, height);
        // If the user chooses choice 9, calculate pythagorean theorem
        } else if (choice == 9) {
            System.out.println("You chose Pythagorean Theorem.");
            System.out.print("Enter side A: ");
            int a = sc.nextInt();
            System.out.print("Enter side B: ");
            int b = sc.nextInt();
            formulas.pythagTheorem(a, b);
        // If the user chooses choice 10, calculate distance between two points
        } else if (choice == 10) {
            System.out.println("You chose Distance Calculation.");
            System.out.print("Enter x1: ");
            int x1 = sc.nextInt();
            System.out.print("Enter y1: ");
            int y1 = sc.nextInt();
            System.out.print("Enter x2: ");
            int x2 = sc.nextInt();
            System.out.print("Enter y2: ");
            int y2 = sc.nextInt();
            formulas.calculateDistance(x1, y1, x2, y2);
        // If the user chooses choice 11, calculate weight
        } else if (choice == 11) {
            System.out.println("You chose Weight Calculation.");
            System.out.print("Enter mass: ");
            int mass = sc.nextInt();
            formulas.calculateWeight(mass);
        // If the user chooses choice 12, calculate gravitational potential energy
        } else if (choice == 12) {
            System.out.println("You chose Gravitational Potential Energy Calculation.");
            System.out.print("Enter mass: ");
            int mass = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();
            formulas.calculateGravPotential(mass, height);
        // If the user chooses choice 13, calculate kinetic energy
        } else if (choice == 13) {
            System.out.println("You chose Kinetic Energy Calculation.");
            System.out.print("Enter mass: ");
            int mass = sc.nextInt();
            System.out.print("Enter velocity: ");
            int velocity = sc.nextInt();
            formulas.calculateKineticEnergy(mass, velocity);
        // If the user chooses choice 14, calculate average speed
        } else if (choice == 14) {
            System.out.println("You chose Average Speed Calculation.");
            System.out.print("Enter distance: ");
            int distance = sc.nextInt();
            System.out.print("Enter time: ");
            int time = sc.nextInt();
            formulas.calculateAverageSpeed(distance, time);
        // If the user chooses choice 15, calculate force 
        } else if (choice == 15) {
            System.out.println("You chose Force Calculation.");
            System.out.print("Enter mass: ");
            int mass = sc.nextInt();
            System.out.print("Enter acceleration: ");
            int acceleration = sc.nextInt();
            formulas.calculateForce(mass, acceleration);
        } else {
        // If the user chooses an invalid choice, tell the user in the terminal
            System.out.println("That's not a valid choice!");
        }
        
        sc.close();
    }
}
