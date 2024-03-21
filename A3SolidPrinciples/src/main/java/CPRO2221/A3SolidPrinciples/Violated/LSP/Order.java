package CPRO2221.A3SolidPrinciples.Violated.LSP;

import java.util.ArrayList;
import java.util.List;

// represents an order in an ecommerce system
public class Order {
    // Order properties
    private List<Product> products;
    private double totalPrice;

    // no args constructor
    public Order() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    // get list of products
    public List<Product> getProducts() {
        return products;
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
}
