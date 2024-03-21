package CPRO2221.A3SolidPrinciples.Solved.LSP;

// subclass representing a digital product that doesn't require shipping
public class DigitalProduct extends Product {
    // invokes the constructor of the superclass
    public DigitalProduct(String name, double rating, double price) {
        super(name, rating, price);
    }

    // overrides the deliver() method in Product class
    @Override
    public void deliver() {
        System.out.println("The order will be instantly available.");
    }
}
