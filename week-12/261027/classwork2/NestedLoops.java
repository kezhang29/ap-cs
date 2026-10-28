public class NestedLoops {
    // Prints a 3x4 multiplication table
    public void drawMultiChart() {
        for (int i = 1; i<= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }

    // Draws a triangle with number of rows equal to argument passed in
    public void drawTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}