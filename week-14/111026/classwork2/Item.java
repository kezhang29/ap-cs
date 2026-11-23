public class Item {
    // Item atributes
    private String name;
    private double price;    

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
