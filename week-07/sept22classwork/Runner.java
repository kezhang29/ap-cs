public class Runner {
    public static void main(String[] args) {
        // Instantiates two UseRadius objects
        UseRadius r1 = new UseRadius();
        UseRadius r2 = new UseRadius(10.0);
        // Prints the 3d sphere volume using radius of both
        r1.printVol();
        r2.printVol();
        // Prints 2d circle area using radius = 5
        r1.printArea(5);
        r2.printArea(5);
        // Prints cylinder volume using radius and height
        r1.printVol(7, 10);
    }    
}
