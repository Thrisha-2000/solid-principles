package SolidPrinciplesViolation;

//Violation Of Interface Segregation and Single Responsibility Principles
public interface Account {
    public void print_balance();
    public void deposit(double amount);
    public void withdraw(double amount);
}
