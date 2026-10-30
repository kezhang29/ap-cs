public class Pet {
    private String name;
    private String species;
    private int hunger;
    private int happiness;
    private boolean isAsleep;
    
    public Pet(String name, String species, int hunger, int happiness, boolean isAsleep) {
        this.name = name;
        this.species = species;
        this.hunger = hunger;
        this.happiness = happiness;
        this.isAsleep = isAsleep;
    }

    public void goOnWalk(int distance) {
        if (!isAsleep) {
            if (hunger <= 70 && happiness <= 90) {
                happiness += distance * 3;
                hunger += distance * 5;
            } else if () {

            } else {

            }
        } else {
            System.out.println(name + " did not go on a walk because they are sleeping");
        }
    }

    
}
