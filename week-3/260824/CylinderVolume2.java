import java.util.Scanner;

// Calculates volume of cylinder based on radius and height
public class CylinderVolume2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input radius: ");
        // Get user input for radius
        double radius = scanner.nextDouble();
        System.out.print("Input height: ");
        // Get user input for heigt
        double height = scanner.nextDouble();
        // Calculate volume
        double volume = Math.PI * Math.pow(radius,2) * height;
        volume = Math.round(volume*100)/100.0;
        // Print volume to console
        System.out.println("The volume of a cylinder with radius " + radius + 
        " and height " + height + " is " + volume);
        
        scanner.close();
    }
}