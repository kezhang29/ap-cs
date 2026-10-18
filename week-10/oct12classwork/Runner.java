package oct12classwork;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Count up by 1 to 12
        int counter = 1;
        while (counter <= 12) {
            System.out.print(counter + " ");
            counter += 1;
        }
        // Count by 2s to 20   
        System.out.println();
        counter = 2;
        while (counter <= 20) {
            System.out.print(counter + " ");
            counter += 2;
        }
        System.out.println();
        counter = 15;
        while (counter >= -10) {
            System.out.print(counter + " ");
            counter -= 5;
        }
        System.out.println();
        System.out.print("Input a number greater than 20: ");
        int highest = sc.nextInt();
        System.out.print("Input common ratio: ");
        int ratio = sc.nextInt();
        counter = 0;
        while (counter <= highest) {
            System.out.print(counter + " ");
            counter += ratio;
        }

        sc.close();
    }    
}
