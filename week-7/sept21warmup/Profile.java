public class Profile {
    // Instance variables that represent attributes of a person
    private String name;
    private int age;
    // Default constructor that sets name to "John" and age to 15   
    public Profile() {
        name = "John";
        age = 15;
    }
    // Initialization constructor that assigns name and age to parameters
    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Prints id and name and age of user
    void printInfo(int id) {
        System.out.print("Id: " + id + " ");
        printVars();
    }
    // Prints name and age of user
    void printVars() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
