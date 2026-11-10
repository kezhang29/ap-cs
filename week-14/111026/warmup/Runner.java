public class Runner {
    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest(5);
        arrayTest.printArr();
        int sum = arrayTest.getSum();   
        System.out.println("\nThe sum is " + sum);
    }    
}
