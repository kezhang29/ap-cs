public class QuizPractice {
    private int[] numArray;
    
    public QuizPractice(int size) {
        numArray = new int[size];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int)(Math.random()*9) + 1;
        }
    }

    public void print() {
       for (int num : numArray) {
            System.out.print(num + " ");
       } 
       System.out.println();
    }

    public int getEven() {
        int num = -1;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) {
                num = numArray[i];
            }
        }
        return num;
    }

}
