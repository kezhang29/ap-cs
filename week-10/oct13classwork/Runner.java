import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Instantiate a scanner object
        Scanner sc = new Scanner(System.in);
        // Initialize num and sum variables
        int num = 2;
        int sum = 0;

        while (num <= 19) {
            sum += num;
            num += 1;
        }
        System.out.print("The sum of numbers from 2-19 is: " + sum);
        num = 2;
        sum = 0;
        do {
            sum += num;
            num += 1;
        } while (num <= 19);
        System.out.print("\nThe sum of numbers from 2-19 is: " + sum);
        int end = 0;
        do {
            System.out.print("\nInput a number greater than one:");        
            end = sc.nextInt();
        } while (end < 1);
        num = 1;
        do {
            System.out.print(num + " ");
            num += 1;1
        } while (num <= end);
        System.out.println();
        num = end;
        do {
            System.out.print(num + " ");
            num -= 1;
        } while (num >= 1);
    }    
}
