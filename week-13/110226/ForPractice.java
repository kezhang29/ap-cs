// Class that practices for loops
public class ForPractice {
    // Prints even numbers from 1-endNum
    public void printEven(int endNum) {
        for (int i = 1; i <= endNum; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
    // Find nums from start-end that are divisible by divisor
    public int findNum(int start, int end, int divisor) {
        int numFound = -1;
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                numFound = i;
                break;
            }
        }
        return numFound;
    }
}
