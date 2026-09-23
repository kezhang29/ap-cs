public class Runner {
    public static void main(String[] args) {
        UseRadius r1 = new UseRadius();
        UseRadius r2 = new UseRadius(10.0);
        r1.printVol();
        r2.printVol();
        r1.printArea(5);
        r2.printArea(5);
        r1.printVol(7, 10);
    }    
}
