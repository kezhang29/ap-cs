// Class that represents and simulated pet behaviors
public class Pet {
    // Attributes of a pet
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

    /**
    * Walks the pet and updates its happiness and hunger attributes accordingly 
    *
    * @param distance The distance the pet walks in miles, happiness and hunger attributes are 
    * updated based on this value 
    */ 
    public void goOnWalk(int distance) {
        // Pet cannot go on a walk if its asleep
        if (!isAsleep) {
            // Pet can go on a walk if its not hungry and not too happy
            if (hunger <= 70 && happiness <= 90) {
                // Update happiness and hunger attributes
                happiness += distance * 3;
                hunger += distance * 5;
                // Make sure both are below 100 by clamping
                happiness = Math.min(100, happiness);
                hunger = Math.min(100, happiness);
                System.out.println(name + " walked " + distance + " miles and liked the walk very much");
            } else if (hunger > 70) {
                System.out.println(name + " did not go on a walk because they were too hungry");
            } else {
                System.out.println(name + " did not go on a walk because they were too happy");
            }
        } else {
            System.out.println(name + " did not go on a walk because they are sleeping");
        }
    }

    /**
     * Feeds the pet a certain amount of food
     * @param foodFed The amount of food that is fed to the pet, and is used to update hunger attribute
     */
    public void feed(int foodFed) {
        // Pet cannot receive food if it's asleep
        if (!isAsleep) {
            // Update hunger attribute 
            hunger -= foodFed *3;
            // Make sure hunger is not below zero
            hunger = Math.max(0, hunger);
        } else {
            System.out.println(name + " will not eat while they are sleeping");
        }
    }

    /**
     * Plays with the pet for a certain number of minutes
     * @param playTime Time in minutes the pet played
     * @return true if the pet played, false if the pet did not play 
     * (I don't understand why we need this method to have a boolean return type, why not void? 
     * It's never called in a conditional anyways)
     */
    public boolean play(int playTime) {
        // If pet is asleep and is hungry, don't play
        if (isAsleep || hunger > 80) {
            return false;
        } else {
            // Increase hunger and happiness after playing and also clamp them to be below 100
            happiness = Math.min(100, happiness += playTime);
            hunger = Math.min(100,hunger += playTime/2);
            return true;
        }
    }

    // Toggles isAsleep true/false
    public void toggleSleep() {
        isAsleep = !isAsleep;
    }

    // Returns whether the pet needs care if its hungry or sad
    public boolean needsCare() {
        return (hunger > 70 || happiness < 50);
    }

    // Returns the status of the pet as a string
    public String getStatus() {
        String status = "======" + name + "======\n" +
                        "Species: " + species + "\n" +
                        "Hunger: " + hunger + "\n" + 
                        "Happiness: " + happiness + "\n" +
                        "Asleep: " + isAsleep;
        return status;
    }

    /**
     * Visits the vet
     * @param vetTime Time in minutes at the vet
     */
    public void vetVisit(int vetTime) {
        // Decreases happiness and makes sure it's above 0
        happiness = Math.max(0, happiness -= vetTime * 3);
    }
}
