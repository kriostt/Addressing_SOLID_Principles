package CPRO2221.A3SolidPrinciples.Violated.OCP;

import java.util.List;

public class OCPMain {
    public static void main(String[] args) {
        // create products
        Product product1 = new Product("Fujifilm Instax Square SQ1 Instant Film Camera", 4.6, 159.99);
        Product product2 = new Product("Echo Dot (5th Gen, 2020 release)", 4.7, 79.99);

        // create order
        Order order = new Order();

        // add products to order
        order.addProduct(product1);
        order.addProduct(product2);

        // display the product names in the order in the format 1. productName
        System.out.println("\n\n" + "Products in the order:");
        List<String> productNames = order.getProductNames();
        for (int i = 0; i < productNames.size(); i++) {
            System.out.println((i + 1) + ". " + productNames.get(i));
        }

        // display total number of items in the order
        System.out.print("\n" + "Total items: " + order.getTotalItems());

        // display the total price of the items in the order
        System.out.println("\n" + "Total price: $" + String.format("%.2f", order.getTotalPrice()));

        // process the order
        order.processOrder();
    }
}
