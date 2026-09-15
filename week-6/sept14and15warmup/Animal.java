// This is a class tha contains methods that sets attributes of an Animal and prints those attributes
public class Animal {
    private String animalType;
    private int age;
    
    public void setVariables(String name, int age) {
        this.animalType = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Animal type: " + animalType);
        System.out.println("Age " + age);
    }

}
