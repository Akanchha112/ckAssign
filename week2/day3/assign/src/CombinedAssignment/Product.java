package CombinedAssignment;

class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

public class Product {
    private int id;
    private String name;
    private double price;

    // Constructor with validation
    public Product(int id, String name, double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Invalid price for product '" + name + "'. Price cannot be negative.");
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters (Encapsulation)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Product ID: " + id + " | Name: " + name + " | Price: ₹" + price);
    }

}
