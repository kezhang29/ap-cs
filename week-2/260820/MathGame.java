import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        // Takes user input for two doubles and prints the sum
        System.out.println("Enter two numbers to add:");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Your sum is: " + (num1 + num2) + "!");

        // Takes user input for two doubles and prints the product
        System.out.println("Enter two numbers to multiply: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Your product is: " + (num1 * num2) + "!");

        // Takes user input for two doubles and prints the difference
        System.out.println("Enter two numbers to subtract: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Your difference is " + (num1 - num2) + "!");

        // Takes user input for two doubles and prints 
        // the result after division
        System.out.println("Enter two numbers to divide: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Your product is: " + (num1 / num2) + "!");

        // Takes user input for two doubles and raises one of them to 
        // the power of the other
        System.out.println("Enter two numbers for exponentiation: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Your answer is: " + Math.pow(num1,num2) + "!");

        scanner.close();
    }
    
     
}
