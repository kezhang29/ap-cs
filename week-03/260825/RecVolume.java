import java.util.Scanner;

public class RecVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width: ");
        double width = sc.nextDouble();
        System.out.print("Enter Height: ");
        double height = sc.nextDouble();
        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        double volume = width * height * length;
        volume = Math.round(volume*100)/100.0;
        System.out.println("Width is " + width + ", height is " + height + ", length is " + 
        length + ". Volume is " + volume);

        
    }
}
