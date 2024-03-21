package CPRO2221.A3SolidPrinciples.Solved.LSP;

public class LSPMain {
    public static void main(String[] args) {
        // create products
        Camera physicalProduct = new Camera("Fujifilm Instax Square SQ1 Instant Film Camera", 4.6, 159.99);
        Ebook digitalProduct = new Ebook("Java: The Complete Reference, Thirteenth Edition", 5.0, 59.99);

        //-----Physical Order-----
        // create physicalOrder
        Order physicalOrder = new Order();

        // add products to physicalOrder
        physicalOrder.addProduct(physicalProduct);

        // display the products in physicalOrder
        System.out.println("\n\n" + "Products in the physical order:");
        for (Product p : physicalOrder.getProducts()) {
            // invokes printDetails() method from Product superclass
            p.printDetails();
        }

        // display total number of items in physicalOrder
        System.out.print("\n" + "Total items: " + physicalOrder.getTotalItems());

        // display the total price of the items in physicalOrder
        System.out.println("\n" + "Total price: $" + String.format("%.2f", physicalOrder.getTotalPrice()));

        // invokes delivery() method from PhysicalProduct subclass
        physicalProduct.deliver();

        // invokes printEstimatedShipping() method from Camera subclass
        physicalProduct.printEstimatedShipping();

        //-----Digital Order-----
        // create digitalOrder
        Order digitalOrder = new Order();

        // add products to digitalOrder
        digitalOrder.addProduct(digitalProduct);

        // display the products in digitalOrder
        System.out.println("\n\n" + "Products in the digital order:");
        for (Product p : digitalOrder.getProducts()) {
            // invokes printDetails() method from Product superclass
            p.printDetails();
        }

        // display total number of items in digitalOrder
        System.out.print("\n" + "Total items: " + digitalOrder.getTotalItems());

        // display the total price of the items in digitalOrder
        System.out.println("\n" + "Total price: $" + String.format("%.2f", digitalOrder.getTotalPrice()));

        // invokes delivery() method from DigitalProduct subclass
        digitalProduct.deliver();

        // invokes download() method from Ebook subclass
        digitalProduct.download();
    }
}
