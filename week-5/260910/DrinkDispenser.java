public class DrinkDispenser {
    public void checkSyrup(){
        double syrup = Math.random() * 100;
        syrup = Math.round(syrup * 100) / 100.0;
        if (syrup >= 30){
            System.out.println("The syrup levels are good, " + syrup + "%");
        } else {
            System.out.println("The syrup levels are critically low " + syrup + "%");
        }
    }

    public void checkIce(){
        int ice = (int) (Math.random() * 51);
        if (ice >= 15){
            System.out.println("The ice bin is full at a weight of " + ice + " pounds");
        } else {
            System.out.println("The ice bin is low at a weight of " + ice + " pounds");
        }
    }

    public void numDrinks(){
        int drinks = (int) (Math.random() * 10 + 1);
        if (drinks >= 4){
            System.out.println("There are " + drinks + " drinks. You will need a drink carrier");
        } else {
            System.out.println("There are " + drinks + " drinks");
        }
    }
}
