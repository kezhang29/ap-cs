// Calculates volume of cylinder based on radius and height
public class CylinderVolume1 {
    public static void main(String[] args) {
        // Initialize radius and height variables
        int radius = 5;
        int height = 12;
        // Calculate volume
        double volume = Math.PI * Math.pow(radius,2) * height;
        // Print volume to console
        System.out.println("The volume of a cylinder with radius " + radius + 
        " and height " + height + " is " + volume);
    }
}
