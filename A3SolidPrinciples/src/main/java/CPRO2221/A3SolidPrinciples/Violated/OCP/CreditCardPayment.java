package CPRO2221.A3SolidPrinciples.Violated.OCP;

public class CreditCardPayment {
    // VIOLATION: only holds one payment type
    // method specifically for the credit card payment method
    public void pay(double amount) {
        System.out.println("\n" + "Paid " + String.format("%.2f", amount) + " using credit card.");
    }
}
