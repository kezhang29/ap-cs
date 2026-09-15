public class Runner {


	public static void main(String args[]) {

        // Instatilizes an object named animal1 with the default user written constructor
		Animal animal1 = new Animal();
        // Instantiates an object named animal2 with initialization constrcutor
		Animal animal2 = new Animal("cat", 7);
        // Instantiates an object named animal3 with initialization constrcuto
		Animal animal3 = new Animal("goat", 2);	

        Animal animal4 = new Animal("dog", "kevin", 10);
        // Calls the printInfo method in the animal object 
		animal1.printInfo();
        // Calls the setName method in animal object which changes name instance variable
		animal2.setName("Roco");
        // Calls the printInfo method in the animal object 
		animal2.printInfo();
        // Calls the setName method in animal object which changes name instance variable
		animal3.setName("Fluffy");
        // Calls the printInfo method in the animal object 
		animal3.printInfo();

        animal4.printInfo();
	}
}
