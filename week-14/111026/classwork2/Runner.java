import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] itemArray = new Item[8];
        itemArray[0] = new Item("Book", 10.90);
        itemArray[1] = new Item("Door", 30.0);
        itemArray[2] = new Item("brain", 15.23);
        itemArray[3] = new Item("Chair", 89.2);
        itemArray[4] = new Item("Computer", 700.0);
        itemArray[5] = new Item("Table", 13.90);
        itemArray[6] = new Item("Hat", 63.2);
        itemArray[7] = new Item("Pizza", 5.99);

        System.out.println("""
            Menu:
               1. Print Items 
               2. Find Items by price
               3. Find Items by Name 
               4. Exit the program
                """);
        int choice;
        do {
            System.out.print("Choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                for (Item i : itemArray) {
                    System.out.println(i.getName() + "\t " + i.getPrice());
                }
            } else if (choice == 2) {
                System.out.print("Enter a price: ");
                double price = sc.nextDouble();
                int count = 0;
                for (Item i : itemArray) {
                    if (i.getPrice() == price) {
                        System.out.println(i.getName() + "\t " + i.getPrice());
                        count += 1;
                    }
                } 
                if (count == 0) {
                    System.out.println("No item with the price of " + price + " was found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter a name: ");
                String name = sc.next();
                int count = 0;
                for (Item i : itemArray) {
                    if (i.getName().equals(name)) {
                        System.out.println(i.getName() + "\t " + i.getPrice());
                        count += 1;
                    }
                } 
                if (count == 0) {
                    System.out.println("No item with the name of " + name + " was found.");
                }
            } else if (choice != 4) {
                System.out.println("Thats not a valid choice!");
            }
        } while (choice != 4);
        System.out.println("Goodbye.");
    }    
}
