// This is a class that calculates different geometrical formulas involving a radius
public class UseRadius {
    // Instance variables that are used during the geometrical calculations
    private double pi;
    private double radius;
    private double volume;
    // Default constructor
    public UseRadius() {
        radius = 0;
        pi = 3.14;
        volume = 0;
    }
    // Initialization constructor that sets radius to the input parameter
    public UseRadius(double radius) {
        this.radius = radius;
        pi = 3.14;
        volume = 0;
    }
    // Prints an area of a 2d circle given radius
    public void printArea(double radius) {
        double area = pi * Math.pow(radius, 2);
        System.out.println("The area is: " + area );
    }
    // Calculates volume using 3d sphere formula
    private void calcVol() {
        volume = 1.33 * Math.pow(radius,3) * pi;
    }
    // Prints the 3d volume of a sphere
    public void printVol() {
        calcVol();
        System.out.println("The volume is " + volume);
    } 
    // Prints the 3d volume of a cylinder given radius and height
    public void printVol(double radius, double height) {
        double vol = Math.pow(radius, 2) * pi * height;
        System.out.println("The volume is " + vol);
    }
}
