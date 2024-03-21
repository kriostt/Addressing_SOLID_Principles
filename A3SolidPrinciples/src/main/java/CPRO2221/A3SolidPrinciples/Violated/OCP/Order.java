package CPRO2221.A3SolidPrinciples.Violated.OCP;

import java.util.ArrayList;
import java.util.List;

// represents an order in an ecommerce system
public class Order {
    // Order properties
    private List<Product> products;
    private double totalPrice;
    // VIOLATION: other payments would need to be added as an Order property
    private CreditCardPayment creditCardPayment;

    // no args constructor
    public Order() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
        // VIOLATION: direct dependency on CreditCardPayment class
        this.creditCardPayment = new CreditCardPayment();
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

    // VIOLATION: directly invokes pay() on CreditCardPayment object so the order is tied to one payment method
    // process the order by completing the payment
    public void processOrder() {
        creditCardPayment.pay(this.totalPrice);
        System.out.println("Order processed!");
    }
}
