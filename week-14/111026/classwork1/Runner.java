public class Runner {
    public static void main(String[] args) {
        Candy[] candyBag = new Candy[5];
        candyBag[0] = new Candy("gigantic candy", 1000);
        candyBag[1] = new Candy("sweet candy", 5);
        candyBag[2] = new Candy("medium candy", 30);
        candyBag[3] = new Candy("big candu", 100);
        candyBag[4] = new Candy("small candy", 2);

        for (Candy candy : candyBag) {
            System.out.println( "Candy Type: " +  candy.getType() + "\t Size: " + candy.getSize());
        }
    }    
}
