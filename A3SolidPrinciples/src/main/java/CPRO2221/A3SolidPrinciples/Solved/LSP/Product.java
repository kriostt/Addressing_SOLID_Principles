package CPRO2221.A3SolidPrinciples.Solved.LSP;

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

    // SOLUTION: all products need to be delivered
    // method declaration to be implemented by Product subclasses
    public abstract void deliver();

    // SOLUTION: all products have product details
    // method to print product details
    public void printDetails() {
        System.out.println("\nProduct: " + name + "\nRating: " + rating + "\nPrice: " + price);
    }
}
