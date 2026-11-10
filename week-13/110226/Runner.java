public class Runner {
    public static void main(String[] args) {
        // Instantiate ForPractice object
        ForPractice forPractice = new ForPractice();
        forPractice.printEven(25);
        // Call findnum() methodd in ForPractice
        int x = forPractice.findNum(9,20,7);
        if (x == -1) {
            // If return is -1, number is not found
            System.out.println("Number not found");
        } else {
            // Print number if found
            System.out.println("Number found: " + x);
        }
        // Do the same for three different numbers
        x = forPractice.findNum(12,21,11); 
        if (x == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found: " + x);
        }
    }    
}
