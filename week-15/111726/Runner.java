public class Runner {
    public static void main(String[] args) {
        QuizPractice arrObj = new QuizPractice(5);
        arrObj.print();
        int even = arrObj.getEven();
        System.out.println("The last even number in the array is (-1 means no even) " + even);
    }    
}
