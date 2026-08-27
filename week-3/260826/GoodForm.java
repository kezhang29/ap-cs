import java.util.Scanner; 
    
public class GoodForm{ 
    public static void main(String args[]) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("I will calculate the area of a circle. Please provide a radius: ");
        double cat =keyBoard.nextDouble();
        double cow = 3.14; 
        double dog = cow * cat * cat;
        System.out.println("The area of this circle is " + dog); 

        keyBoard.close();
    }
}

