//** This class contains many methods used to calculate formulas in
// geometry, algebra, and physics*/
public class Formulas {
   // Instantiate necessary values for some calculations
   private final double pi = 3.14;
   private final double gravity = 9.8;

   // Calculates triangle area using base * height / 2
   public void triangleArea(int base, int height) {
      double area = base * height / 2.0;
      System.out.println("The area of the triangle with base length " + base + " and height length " + height
      + " has area: " + area);
   }

   // Calculates rectangle area using length * height
   public void rectArea(int length, int height) {
      double area = length * height;
      System.out.println("The area of the rectangle with length " + length + " and height " + height + " is: " + area);
   }

   // Calculates square area using side^2
   public void squareArea(int sideLength) {
      double area = Math.pow(sideLength, 2);
      System.out.println("The area of the square with side length " + sideLength + " is: " + area);
   }

   // Calculates trapezoid area using average of top base and bottom base multiplied by height
   public void trapezoidArea(int bottomBase, int topBase, int height) {
      double area = height * (bottomBase + topBase) / 2.0;
      System.out.println("The area of the trapezoid with bottom base: " + bottomBase + ", top base " + topBase
            + ", and height " + height + " is: " + area);
   }

   //Calculates sphere volume using 4/3 * pi * radius^3
   public void sphereVolume(int radius) {
      double volume = 4.0 / 3 * pi * Math.pow(radius, 3);
      System.out.println("The volume of the sphere with radius " + radius + " is: " + volume);
   }

   // Calculates cone volume using 1/3 * radius ^2 * pi * height
   public void coneVolume(int radius, int height) {
      double volume = 1.0 / 3 * pi * Math.pow(radius, 2) * height;
      System.out.println("The volume of the cone with radius " + radius + " and height " + height + " is: " + volume);
   }

   // Calculates cube volume using side^3
   public void cubeVolume(int side) {
      double volume = Math.pow(side, 3);
      System.out.println("The volume of the cube with side length " + side + " is: " + volume);
   }

   // Calculates rectangular prism volume using length * width * height
   public void rectPrismVolume(int length, int width, int height) {
      double volume = length * width * height;
      System.out.println("The volume of the rectangular prism with length " + length + ", width " + width
            + ", and height " + height + " is: " + volume);
   }

   // Caclulates pythagorean theorem using sqrt(a^2+b^2)
   public void pythagTheorem(int a, int b) {
      double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
      System.out.println("The hypotenuse of the right triangle with side A: " + a + " and side B: " + b + " is: " + c);
   }

   // Calculates distance using distance formula: sqrt[(x1 - x2)^2 + (y1-y2)^2]
   public void calculateDistance(int x1, int y1, int x2, int y2) {
      double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      System.out.println(
            "The distance between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);
   }

   // Calculates weight using mass * gravity
   public void calculateWeight(int mass) {
      double weight = mass * gravity;
      System.out
            .println("The weight of an object with mass " + mass + " (under gravity " + gravity + ") is: " + weight);
   }

   // Calculates gravitational potential energy using mass * height * gravity
   public void calculateGravPotential(int mass, int height) {
      double gravPotentialEnergy = mass * height * gravity;
      System.out.println("The gravitational potential energy for mass " + mass + " at height " + height + " is: "
            + gravPotentialEnergy);
   }

   // Calculates kinetic Energy using 1/2 * mass * velocity^2
   public void calculateKineticEnergy(int mass, int velocity) {
      double kineticEnergy = 1.0 / 2 * mass * Math.pow(velocity, 2);
      System.out.println(
            "The kinetic energy of mass " + mass + " moving at velocity " + velocity + " is: " + kineticEnergy);
   }

   // Calculates average speed using distance / time
   public void calculateAverageSpeed(int distance, int time) {
      double averageSpeed = (double) distance / time;
      System.out.println("The average speed for traveling a distance of " + distance + " over " + time
            + " units of time is: " + averageSpeed);
   }

   // Calculates force using mass * acceleration
   public void calculateForce(int mass, int acceleration) {
      int force = mass * acceleration;
      System.out.println("The force by mass " + mass + " accelerating at " + acceleration + " is: " + force);
   }
}
