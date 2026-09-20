public class Runner {
    public static void main(String[] args) {
        // Instantiate rectangle objects and calls methods fron them
        Rectangle rect1 =  new Rectangle();
        rect1.printArea();
        Rectangle rect2 = new Rectangle(3,4);
        rect2.printArea();
        // Instantiate triangle objects and calls printArea method
        Triangle triangle1 = new Triangle();
        triangle1.printArea();
        Triangle triangle2 = new Triangle(3,4);
        triangle2.printArea();
    }
}
