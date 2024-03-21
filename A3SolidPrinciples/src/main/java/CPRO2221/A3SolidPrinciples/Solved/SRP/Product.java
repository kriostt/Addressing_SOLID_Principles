package CPRO2221.A3SolidPrinciples.Solved.SRP;

// represents a product in an ecommerce system
public class Product {
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
}
