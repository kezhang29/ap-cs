public class Runner {
   public static void main(String[] args) {
        ForTest forTest = new ForTest();
        int factorial5 = forTest.getFactorial(5);
        System.out.println("The factorial of 5 is " + factorial5);
   } 
}

class ForTest {
    int getFactorial(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }
}
