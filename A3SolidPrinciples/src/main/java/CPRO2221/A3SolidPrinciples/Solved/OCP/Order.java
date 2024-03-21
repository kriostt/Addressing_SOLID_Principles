package CPRO2221.A3SolidPrinciples.Solved.OCP;

import java.util.ArrayList;
import java.util.List;

// represents an order in an ecommerce system
public class Order {
    // Order properties
    private List<Product> products;
    private double totalPrice;
    private Payment payment;

    // no args constructor
    public Order() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
        this.payment = null;
    }

    // get product names of products in the order
    public List<String> getProductNames() {
        // initialize array list to store product names
        List<String> productNames = new ArrayList<>();

        // iterate through the products in the order and get the product name for each
        for (Product product : products) {
            productNames.add(product.getName());
        }

        return productNames;
    }

    // get total number of products in the order
    public int getTotalItems() {
        return products.size();
    }

    // get the total price of the products in the order
    public double getTotalPrice() {
        return totalPrice;
    }

    // add products to the order and update the total price
    public void addProduct(Product product) {
        this.products.add(product);
        this.totalPrice += product.getPrice();
    }

    // process the order by completing the payment
    public void processOrder(Payment p) {
        this.payment = p;
        payment.pay(this.totalPrice);
        System.out.println("Order processed!");
    }
}
