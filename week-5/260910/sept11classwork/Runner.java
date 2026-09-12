public class Runner {
    public static void main(String[] args) {
        // Instantiate objects of squares and circles
        Square square = new Square();
        Circle circle = new Circle();

        square.printArea();
        square.changeSide();
        square.printArea();
        circle.printArea();
        circle.setRadius();
        circle.printArea();
    }
}
