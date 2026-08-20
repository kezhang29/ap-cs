// This class calculates the area and perimeter of a rectangle
public class VarQuizB {
    public static void main(String[] args) {
        int width;
        double length;
        double area, perimeter;

        // Assign width and length attributes of rectangle
        width = 9;
        length = 4.52;
        // Area calculation
        area = width * length;
        // Perimeter calculation
        perimeter = 2 * (width + length);

        // Output width, height, area, and perimeter of rectangle
        System.out.println("width: " + width + "\nlength: " + length);
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}