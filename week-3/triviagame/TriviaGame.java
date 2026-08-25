import java.util.Scanner;

public class TriviaGame {
    static public int score;
    static void checkAnswer(String answer, String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Good job!");
            score += 1;
        } else {
             System.out.println("Sorry, wrong answer");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is the sky blue? ");
        String answer = sc.next();
        checkAnswer(answer, "yes");
        System.out.print("Where are we right now? ");
        sc.nextLine();
        answer = sc.nextLine();
        checkAnswer(answer, "mountain view");
        System.out.print("What is 3+5? ");
        answer = sc.next();
        checkAnswer(answer, "8");
        System.out.print("What does jdk stand for? ");
        sc.nextLine();
        answer = sc.nextLine();
        checkAnswer(answer, "java development kit");
        System.out.print("where was kevin born? ");
        answer = sc.next();
        checkAnswer(answer, "texas");
        System.out.print("what is heating up the earth right now? ");
        sc.nextLine();
        answer = sc.nextLine();
        checkAnswer(answer, "global warming");
        System.out.print("\nScore: " + score);

        sc.close();
    }
}