public class Runner {
    public static void main(String[] args) {
        // Initialize ArrayTest
        ArrayTest arrayTest = new ArrayTest(5);
        arrayTest.printArr();
        int sum = arrayTest.getSum();   
        // Print the sum
        System.out.println("\nThe sum is " + sum);
    }    
}
