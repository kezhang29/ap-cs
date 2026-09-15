
public class Triangle {
    private int base;
    private int height;
   
    public Triangle() {
        this.base = 0;
        this.height = 0;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void printArea() {
        System.out.println("The area is: " + base * height / 2.0);
    }
}
