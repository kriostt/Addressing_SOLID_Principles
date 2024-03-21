package CPRO2221.A3SolidPrinciples.Solved.LSP;

// subclass representing an ebook digital product
public class Ebook extends DigitalProduct {
    // invokes the constructor of the superclass
    public Ebook(String name, double rating, double price) {
        super(name, rating, price);
    }

    // method specifically for downloading an ebook digital product
    public void download() {
        System.out.println("The order is available for download.");
    }
}
