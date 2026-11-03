public class Runner {
    public static void main(String[] args) {
        ForPractice forPractice = new ForPractice();
        forPractice.printEven(25);
        int x = forPractice.findNum(9,20,7);
        if (x == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found: " + x);
        }
        x = forPractice.findNum(12,21,11); 
        if (x == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found: " + x);
        }
    }    
}
