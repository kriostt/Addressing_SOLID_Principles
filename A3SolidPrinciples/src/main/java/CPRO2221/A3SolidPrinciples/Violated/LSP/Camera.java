package CPRO2221.A3SolidPrinciples.Violated.LSP;

// subclass representing a laptop product
public class Camera extends Product {
    // invokes the constructor of the superclass
    public Camera(String name, double rating, double price) {
        super(name, rating, price);
    }

    // overrides the ship() method in Product class
    @Override
    public void ship() {
        System.out.println("The order is preparing to ship.");
    }
}
