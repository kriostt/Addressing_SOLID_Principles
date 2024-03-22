package CPRO2221.A3SolidPrinciples.Solved.LSP;

// subclass representing a physical product that requires shipping
public class PhysicalProduct extends Product {
    // invokes the constructor of the superclass
    public PhysicalProduct(String name, double rating, double price) {
        super(name, rating, price);
    }

    // SOLUTION: a physical product can implement the deliver method
    // overrides the deliver() method in Product class
    @Override
    public void deliver() {
        System.out.println("The order is preparing to ship.");
    }
}
