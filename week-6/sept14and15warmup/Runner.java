import java.util.Scanner;

public class Runner {
   public static void main(String[] args) {
        // Instantiate animal objects
        Animal aObj1 = new Animal();
        Animal aObj2 = new Animal();
        Scanner sc = new Scanner(System.in);
        // Get User input for name and age
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input age: ");
        int age = sc.nextInt();
        // Set instance variables in object 1 to user input
        aObj1.setVariables(name,age);
        aObj1.printInfo();
        // Set instance variables in objecr 2 to "Horse" and 7
        aObj2.setVariables("Horse", 7);
        aObj2.printInfo();

        sc.close();
   } 
}
