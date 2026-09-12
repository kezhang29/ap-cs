public class Oven {
    public void checkTemp() {
        double temperature = Math.random() * 250 + 250;
        if (temperature <= 425) {
            System.out.println("Oven is ready!");
        } else {
            System.out.println("Temperature is too hot!");
        }
        System.out.println("The temperature is " + Math.round(temperature * 100) / 100.0);
    }

    public void checkTimer() {
        int timeMinutes = (int) (Math.random() * 11);
        if (timeMinutes < 2) {
            System.out.println("Beep Beep");
            System.out.println(timeMinutes);
        } else {
            System.out.println(timeMinutes);
        }
    }

    public void bakePizza() {
        int timeMinutes = (int) (Math.random() * 21 + 5);
        if (timeMinutes > 15) {
            System.out.println("The pizza is in danger!");
        } else {
            System.out.println("This pizza will print nicely");
        }
        System.out.println("Baking for " + timeMinutes);
    }
}
