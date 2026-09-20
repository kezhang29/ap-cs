
public class Triangle {
    private int base;
    private int height;
   
    // default constructor that sets instance vars to zero
    public Triangle() {
        this.base = 0;
        this.height = 0;
    }
    // initialization constructor that instantiates an object with base length base
    // and height length height
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    // prints the triangle's area to consolve
    public void printArea() {
        System.out.println("The area is: " + base * height / 2.0);
    }
}
