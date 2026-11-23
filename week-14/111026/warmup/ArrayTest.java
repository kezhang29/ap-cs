public class ArrayTest {
    private int[] numArr;
    
    public ArrayTest(int length) {
        this.numArr = new int[length];
        // Intiailize numArr with random elements from 1-9
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (9 * Math.random()) + 1;
        }
    }

    // Prints each element with a for each loop
    public void printArr() {
        System.out.println("The " + numArr.length + " elements are ");
        for (int i : numArr) {
            System.out.print(i + " ");
        }
    }

    // Sums the elements using a for each loop
    public int getSum() {
        int sum = 0;
        for (int i : numArr) {
            sum += i;
        }
        return sum;
    }
}
