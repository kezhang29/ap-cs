public class Square {
    // Declare instance variables that belong to S
    private int side = 7;

    public void changeSide() {
        side = 5;
    }

    public void printArea() {
        System.out.println(Math.pow(side,2));
    }
}
 