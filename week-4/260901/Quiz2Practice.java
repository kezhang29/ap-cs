import java.util.Scanner;

public class Quiz2Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length, width;
        String answer;

        System.out.print("Input length: ");
        length = sc.nextDouble();
        System.out.print("Input Width:");
        width = sc.nextDouble();
        System.out.print("Would you like to calculate the area or perimeter? ");
        answer = sc.next().toLowerCase();
        if (answer.equals("area")) {
            System.out.println("The area is " + length * width);
        } else if (answer.equals("perimeter")) {
            System.out.println("The area is " + 2* (length + width));
        }

        sc.close();
    }
}
