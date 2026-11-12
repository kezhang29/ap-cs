public class Runner {
    public static void main(String[] args) {
        Car[] cars = new Car[5];    
        cars[0] = new Car("Honda", 4);
        cars[1] = new Car("Tesla", 4);
        cars[2] = new Car("Waymo", 3);
        cars[3] = new Car("Lexus", 4);
        cars[4] = new Car("Van", 6);

        for (Car car : cars) {
            System.out.println("The " + car.getModel() + " has " + car.getNumDoors() + " doors.");
        }
    }


}
