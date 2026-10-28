import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NestedLoops nestedLoops = new NestedLoops();
        nestedLoops.drawFilledBox();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        nestedLoops.drawFilledBox(width, length);
        nestedLoops.drawMultiChart();
         System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        nestedLoops.drawTriangle(rows);

    }    
}
