package CPRO2221.A3SolidPrinciples.Solved.OCP;

// SOLUTION: this interface holds method that can be implemented by different payment methods
// interface to be implemented by different payment methods
public interface Payment {
    public abstract void pay(double amount);
}
