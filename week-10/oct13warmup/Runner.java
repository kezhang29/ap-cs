public class Runner {
    public static void main(String[] args) {
        // Instantiate a pythagorean object
        Pythagorean pythag = new Pythagorean();
        // Assign the side c of triangle 5,12 to answer
        double answer = pythag.findC(5,12);
        // Print answer
        System.out.print("The hypotenuse of a right triangle with legs 5,12 is " + answer);
    }
}


class Pythagorean {
    double findC(double a, double b) {
        // Calculate hypotenuse
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }
}
