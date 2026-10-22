public class QuizPractice {
    public int factorial(int num) {
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        return total;
    }

    public void countUpBy5(int num) {
        int i = 5;
        do {
            System.out.print(i + " ");
            i += 5;
        } while (i <= num);
    }
}
