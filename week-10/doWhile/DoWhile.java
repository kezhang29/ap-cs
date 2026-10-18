import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        do {
            System.out.print("Enter an integer larger than 5: ");
            userInput = sc.nextInt();
        } while (userInput < 5);        

        System.out.println("You entered: " + userInput);
    }    
}
