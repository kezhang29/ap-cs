public class MathTest {
    // Method that divides numerator by denominator and prints results
    public void divide(int numerator, int denominator) {
        double result = (double) numerator/denominator;
        System.out.println("The result after division is " + result);
    }    
    // Calculate slope and print it
    public void slope(int x1, int y1, int x2, int y2) {
        double slope = (double)(y2 - y1) / (x2-x1);
        System.out.println("The slope is " + slope);
    }
}
