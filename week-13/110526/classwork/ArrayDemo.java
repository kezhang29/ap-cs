public class ArrayDemo {
    public static void main(String[] args) {
        // Instantiate an array that can hold 5 elements
        int[] arr1 = new int[5];
        System.out.print("Demo 1: ");
        // Assigns the 5 elements random values
        arr1[0] = (int)(Math.random() * 20) + 1;
        arr1[1] = (int)(Math.random() * 20) + 1;
        arr1[2] = (int)(Math.random() * 20) + 1;
        arr1[3] = (int)(Math.random() * 20) + 1;
        arr1[4] = (int)(Math.random() * 20) + 1;
        // Print the 5 array elements
        System.out.print(arr1[0] + " " + arr1[1] + " " + arr1[2] + " " + arr1[3] + " " + arr1[4]);

        System.out.print("\nDemo 2:");
        int[] arr2 = new int[25];
        // Assign each element a random number using a for loop
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random() * 9) + 1;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.print("\nDemo 3: ");
        // Array instantiation using array intialization
        String[] arr3 = {"Hello", "Kevin", "Wall", "Tall", "Ball"};
        int count = 0;
        // Prints array elements using a while loop
        while (count < arr3.length) {
            System.out.println(arr3[count]);
            count += 1;
        }
    }    
}
