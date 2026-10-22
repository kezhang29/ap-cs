public class Runner {
    public static void main(String[] args) {
        QuizPractice quizPractice = new QuizPractice();
        int factorial10 = quizPractice.factorial(10);
        System.out.println("The factoreial of 10 is " + factorial10);
        quizPractice.countUpBy5(50);
        System.out.println();
        quizPractice.countUpBy5(68);
    }    
}
