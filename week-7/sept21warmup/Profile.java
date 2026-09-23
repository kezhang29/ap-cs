public class Profile {
    private String name;
    private int age;
    
    public Profile() {
        name = "John";
        age = 15;
    }

    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo(int id) {
        System.out.print("Id: " + id + " ");
        printVars();
    }

    void printVars() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
