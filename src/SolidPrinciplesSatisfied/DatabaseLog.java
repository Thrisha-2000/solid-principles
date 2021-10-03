package SolidPrinciplesSatisfied;

public class DatabaseLog implements ShowBalance{
    double balance;
    DatabaseLog(double balance)
    {
        this.balance=balance;
    }

    @Override
    public void show_balance() {
        System.out.println("Initial Balance in this account is "+this.balance);
    }
}



