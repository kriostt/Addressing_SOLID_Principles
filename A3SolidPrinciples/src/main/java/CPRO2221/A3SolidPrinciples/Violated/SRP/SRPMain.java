package CPRO2221.A3SolidPrinciples.Violated.SRP;

import java.util.List;

public class SRPMain {
    public static void main(String[] args) {
        // create a new order
        Order order = new Order();

        // add products to the order
        order.addProduct("Fujifilm Instax Square SQ1 Instant Film Camera", 4.6, 159.99);
        order.addProduct("Echo Dot (5th Gen, 2020 release)", 4.7, 79.99);

        // display the product names in the format 1. productName
        System.out.println("Products in the order:");
        List<String> productNames = order.getProductNames();
        for (int i = 0; i < productNames.size(); i++) {
            System.out.println((i + 1) + ". " + productNames.get(i));
        }

        // display total number of items in the order
        System.out.print("\n" + "Total items: " + order.getTotalItems());

        // display the total price of the items in the order
        System.out.println("\n" + "Total price: $" + String.format("%.2f", order.getTotalPrice()));
    }
}
