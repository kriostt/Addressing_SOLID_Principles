package CPRO2221.A3SolidPrinciples.Solved.OCP;

// interface to be implemented by different payment methods
public interface Payment {
    public abstract void pay(double amount);
}
