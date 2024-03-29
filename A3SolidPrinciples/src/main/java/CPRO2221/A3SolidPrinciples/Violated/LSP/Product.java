package CPRO2221.A3SolidPrinciples.Violated.LSP;

// represents a product in an ecommerce system
public abstract class Product {
    // Product properties
    private String name;
    private double rating;
    private double price;

    // all args constructor
    public Product(String name, double rating, double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    // get product name
    public String getName() {
        return name;
    }

    // get product rating
    public double getRating() {
        return rating;
    }

    // get product price
    public double getPrice() {
        return price;
    }

    // method declaration to be implemented by Product subclasses
    public abstract void ship();

    // method to print product details
    public void printDetails() {
        System.out.println("\nProduct: " + name + "\nRating: " + rating + "\nPrice: " + price);
    }
}
