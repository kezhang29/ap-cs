public class UseRadius {
    private double pi;
    private double radius;
    private double volume;
    
    public UseRadius() {
        radius = 0;
        pi = 3.14;
        volume = 0;
    }

    public UseRadius(double radius) {
        this.radius = radius;
        pi = 3.14;
        volume = 0;
    }

    public void printArea(double radius) {
        double area = pi * Math.pow(radius, 2);
        System.out.println("The area is: " + area );
    }

    private void calcVol() {
        volume = 1.33 * Math.pow(radius,3) * pi;
    }

    public void printVol() {
        calcVol();
        System.out.println("The volume is " + volume);
    } 

    public void printVol(double radius, double height) {
        double vol = Math.pow(radius, 2) * pi * height;
        System.out.println("The volume is " + vol);
    }
}
