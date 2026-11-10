public class GridPattern {
    public static void main(String[] args) {
        // Generate the width and height for the multiplication table
        int rand = (int) (Math.random() * 7) + 4;
        for (int i = 1; i <= rand; i++) {
            for (int j = 1; j<= rand; j++) {
                // Calculate prodct
                int product = i*j;
                // If product > 20, then print max instead of productj
                if (product > 20) {
                    System.out.print("Max\t");
                    break;
                }
                // If productis divisible by 4, then print -- and skip over to the next row
                if (product % 4 == 0) {
                    System.out.print("--\t");
                    continue;
                }
                System.out.print(product + "\t");
            }
            // Next row
            System.out.println();
        }
    }    
}
