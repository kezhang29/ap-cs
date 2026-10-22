public class RandEx {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 26);
        int num2 = (int) (Math.random() * 26);
        int smallestNum;
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
            smallestNum = num2;
        } else if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
            smallestNum = num1;
        } else {
            System.out.println(num1 + " is less than " + num2);
            smallestNum = num1;
        }
        System.out.println("The average of " + num1 + " and " + num2 
        + " is " + (num1 + num2)/2.0);
        System.out.println(smallestNum + " raised to the 4th power is " + Math.pow(smallestNum, 4));

    }
}