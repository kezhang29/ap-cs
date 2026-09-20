public class Rectangle {
    private int length;
    private int width;
    
    // default constructor that sets instance vars to zero
    public Rectangle() {
        this.width = 0;
        this.length = 0;
    }
    // initialization constructor that sets width to length width
    // and height to length height
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    } 
    // prints area of rectangle to console
    public void printArea() {
        System.out.println("The the area of the rectangle: " + width * length);
    }
}
