public class ArrayTest {
    private int[] numArr;
    
    public ArrayTest(int length) {
        this.numArr = new int[length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (9 * Math.random()) + 1;
        }
    }

    public void printArr() {
        System.out.println("The " + numArr.length + " elements are ");
        for (int i : numArr) {
            System.out.print(i + " ");
        }
    }

    public int getSum() {
        int sum = 0;
        for (int i : numArr) {
            sum += i;
        }
        return sum;
    }
}
