package CPRO2221.A3SolidPrinciples.Solved.OCP;

// represents a payment method using a credit card
public class CreditCardPayment implements Payment {
    // overrides the method in the payment interface to be specific to the credit card payment method
    @Override
    public void pay(double amount) {
        System.out.println("\n" + "Paid " + String.format("%.2f", amount) + " using credit card.");
    }
}
