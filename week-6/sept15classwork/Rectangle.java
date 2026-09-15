public class Rectangle {
    private int length;
    private int width;
    
    public Rectangle() {
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    } 

    public void printArea() {
        System.out.println("The the area of the rectangle: " + width * length);
    }
}
