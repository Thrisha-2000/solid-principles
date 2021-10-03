package SolidPrinciplesViolation;

public class DatabaseLog{
    public double balance;
    public DatabaseLog(double balance)
    {
        this.balance=balance;
    }
    public void show_balance()
    {
        System.out.println("Initial Balance in this account is "+this.balance);
    }
}
