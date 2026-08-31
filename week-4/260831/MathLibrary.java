import java.util.Scanner;

public class MathLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating the volume of a cylinder");
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.println("The volume of this cylinder is " + Math.PI * Math.pow(radius,2) * height);

        System.out.println("Solving the quadratic formula");
        System.out.print("Input integer a: ");
        int a = sc.nextInt();
        System.out.print("Input integer b: ");
        int b = sc.nextInt();
        System.out.print("Input integer c: ");
        int c = sc.nextInt();
        double discriminant = Math.pow(b,2) - 4*a*c;
        if (discriminant < 0) {
            System.out.println("There is no real solutions to this quadratic.");
        } else if (discriminant == 0 ){
            System.out.println("Your solution to this quadratic is: " + (-b/(2*a)));
        } else {
            System.out.println("Your solutions are: " + (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a) 
            + " and " + (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a));
        }

        System.out.println("Solving the pythagorean theorem");
        System.out.print("Input a value for a: ");
        a = sc.nextInt();
        System.out.print("Input a value for b: ");
        b = sc.nextInt();
        System.out.println("The value of c is: " + Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));

        sc.close();
    }
   
}
