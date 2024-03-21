package CPRO2221.A3SolidPrinciples.Violated.SRP;

import java.util.ArrayList;
import java.util.List;

// represents the cart in an ecommerce system
public class Order {
    // Order properties
    private List<List<Object>> products;
    private double totalPrice;

    // no args constructor
    public Order() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    // get product names of products in the order
    public List<String> getProductNames() {
        // initialize array list to store product names
        List<String> productNames = new ArrayList<>();

        // iterate through the products in the order and get the product name for each
        for (List<Object> product : products) {
            productNames.add((String)product.getFirst());
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

    // VIOLATION: handles product details (this should be handled by a separate Product class)
    // add products to the order by directly passing the parameters to this method
    public void addProduct(String name, double rating, double price) {
        // initialize array list to store product details
        List<Object> product = new ArrayList<>();

        // add product details
        product.add(name);
        product.add(rating);
        product.add(price);

        // add the product with details to products and update the total price
        this.products.add(product);
        this.totalPrice += price;
    }
}
