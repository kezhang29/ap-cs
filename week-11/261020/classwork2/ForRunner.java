public class ForRunner {
    public static void main(String[] args) {
        // Prints numbers 1-25 inclusive counting up
        for (int i = 1; i<= 25; i++) {
            System.out.print(i +", ");
        }
        System.out.println();
        // Prints numbers 25-1 counting down
        int j = 25;
        while (j > 0) {
            System.out.print(j + ", ");
            j--;
        }
        // Calculates and prints sum of numbers 1-25
        int sum = 0;
        int k = 1;
        do {
            sum += k;
            k++;
        } while (k <= 25);
        System.out.println("\nThe sum of the numbers from 1-25 is " + sum);
    }    
}
