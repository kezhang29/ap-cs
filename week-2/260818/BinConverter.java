import java.util.Scanner;

// converts user input integer 0-15 to binary
public class BinConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between [0-15] to convert to binary.");
        int number = sc.nextInt();
        int remainder = 0;
        double result = 0;
        //Calculation starts here.
        
        for (int i = 3; i >= 0; i--) {
            int div = (int) Math.pow(2,i);
            result =  number/ div; //divide number by 8 and set equal to the result
            if( result > 0 ){
                //print 1 on the same line.
                //get the remainder by setting the remainder to number-8
                //number will become the remainder
                System.out.print("1");
                remainder = number % div;
                number = remainder;   
            } 
            else {
                //print 0
                System.out.print("0");
            }
        }

    }
}
