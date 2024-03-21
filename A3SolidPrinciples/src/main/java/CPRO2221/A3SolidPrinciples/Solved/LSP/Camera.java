package CPRO2221.A3SolidPrinciples.Solved.LSP;

// subclass representing a laptop physical product
public class Camera extends PhysicalProduct {
    // invokes the constructor of the superclass
    public Camera(String name, double rating, double price) {
        super(name, rating, price);
    }

    // method specifically for printing the estimated shipping time for a camera physical product
    public void printEstimatedShipping() {
        System.out.println("The shipping will take approximately 3-5 days.");
    }
}
