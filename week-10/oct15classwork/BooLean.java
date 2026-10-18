import java.util.Scanner;

public class BooLean {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Do you want to play?: ");
       String answer = sc.next();
       int totalPoints = 20;
       do {
            int num1 = (int) (Math.random()*10+1);
            int num2 = (int) (Math.random()*10+1);
            System.out.println("Your numbers are: " + num1 + " and " + num2);
            if ((num1 == 5) && (num2 == 5)) {
                System.out.println("You win 10 points!");
                totalPoints += 10;
            } else if (num1 == num2) {
                System.out.println("You win 3 points!");
                totalPoints += 3;
            } else if (num1 % 2 == 0 || num2 % 2 == 0) {
                System.out.println("You win 2 points!");
                totalPoints += 2;
            } else {
                System.out.println("You lose one point!");
                totalPoints += 1;
            }
            System.out.print("Total points: " + totalPoints + "\n");
            System.out.print("Do you want to play again?: ");
            answer = sc.next();
       } while (answer.equalsIgnoreCase("yes"));
   } 
}
