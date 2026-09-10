import java.util.Scanner;

public class Circle {
    private final double PI = 3.14;
    private double radius = 0;
    
    public void setRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a radius: ");
        radius = sc.nextDouble();
        sc.close();
    }

    public void printArea() {
        double area = PI * Math.pow(radius,2);
        System.out.println("The area is " + area);
    }
}
