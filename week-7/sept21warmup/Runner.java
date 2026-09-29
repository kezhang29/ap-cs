public class Runner {
    public static void main(String[] args) {
        // Instantiate two user objects
        Profile p1 = new Profile();
        Profile p2 = new Profile("Jennifer", 16);
        // Print info for the two user objects
        p1.printInfo(1234);
        p2.printInfo(4321);
    }

}
