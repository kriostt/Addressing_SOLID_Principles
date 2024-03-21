package CPRO2221.A3SolidPrinciples.Solved.OCP;

import java.util.List;

public class OCPMain {
    public static void main(String[] args) {
        // create products
        Product product1 = new Product("Fujifilm Instax Square SQ1 Instant Film Camera", 4.6, 159.99);
        Product product2 = new Product("Echo Dot (5th Gen, 2020 release)", 4.7, 79.99);

        // create payment methods
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();

        //-----ORDER 1-----
        // create order1
        Order order1 = new Order();

        // add products to order1
        order1.addProduct(product1);
        order1.addProduct(product2);

        // display the product names in order1 in the format 1. productName
        System.out.println("\n\n" + "Products in the order:");
        List<String> productNames1 = order1.getProductNames();
        for (int i = 0; i < productNames1.size(); i++) {
            System.out.println((i + 1) + ". " + productNames1.get(i));
        }

        // display total number of items in order1
        System.out.print("\n" + "Total items: " + order1.getTotalItems());

        // display the total price of the items in order1
        System.out.println("\n" + "Total price: $" + String.format("%.2f", order1.getTotalPrice()));

        // process order1 with credit card payment method
        order1.processOrder(creditCardPayment);

        //-----ORDER 2-----
        // create order2
        Order order2 = new Order();

        // add products to order2
        order2.addProduct(product1);

        // display the product names in order2 in the format 1. productName
        System.out.println("\n\n" + "Products in the order:");
        List<String> productNames2 = order2.getProductNames();
        for (int i = 0; i < productNames2.size(); i++) {
            System.out.println((i + 1) + ". " + productNames2.get(i));
        }

        // display total number of items in order2
        System.out.print("\n" + "Total items: " + order2.getTotalItems());

        // display the total price of the items in order2
        System.out.println("\n" + "Total price: $" + String.format("%.2f", order2.getTotalPrice()));

        // process order2 with PayPal payment method
        order2.processOrder(payPalPayment);
    }
}
