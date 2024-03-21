package CPRO2221.A3SolidPrinciples.Violated.LSP;

// subclass representing an ebook product
public class Ebook extends Product {
    // invokes the constructor of the superclass
    public Ebook(String name, double rating, double price) {
        super(name, rating, price);
    }

    // VIOLATION: an ebook doesn't need to be shipped
    // overrides the ship() method in Product class
    @Override
    public void ship() {

    }
}
