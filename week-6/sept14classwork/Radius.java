// Class that contains methods to calculate different properties of circles
public class Radius {
    private double pi = 3.14;

    public void printArea(double radius) {
        System.out.println("The area is " + Math.pow(radius,2) * pi);
    }

    public void printCir(double radius) {
        System.out.println("The circumference is " + 2 * pi * radius);
    }

    public void printConeVol(double radius, double height) {
        System.out.println("The volume is " + 1.0/3 * Math.pow(radius,2) * pi * height);
    }
}
