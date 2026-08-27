import java.util.Scanner;

public class RandomQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my random quiz game!");
        System.out.println("Input 1 if you want questions about Binary to base-10 conversion");
        System.out.println("Input 2 if you want History trivia");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("You selected binary conversion!");
            System.out.println("Convert 10 to base 10: ");
            int answer = sc.nextInt();
            if (answer == 2) {
                System.out.println("Good Job! That's correct!");
            } else {
                System.out.println("Nice Try, but that's incorrect");
            }
        } else if (x == 2){
            System.out.println("You selected history trivia!");
            System.out.println("Who was the first US president");
            sc.nextLine();
            String answer = sc.nextLine();
            if (answer.equals("George Washington")) {
                System.out.println("Good Job! That's correct!");
            } else {
                System.out.println("Nice Try, but that's incorrect");
            }
        } else {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}