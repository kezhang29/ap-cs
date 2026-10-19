import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Instantiate a MathTest object
        MathTest mathtest = new MathTest();
        //Instantiate a scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for a numerator and a denominator
        System.out.print("Enter a numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter a denoinator: ");
        int denom = sc.nextInt();
        // Call method from MathTest class that divides num/denom
        mathtest.divide(numerator, denom);
        // Prompt user for four points
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();
        // Calculate slope
        mathtest.slope(x1,y1,x2,y2);
    }    
    
}
