package SolidPrinciplesViolation;

public class SavingsAccount implements Account{
    DatabaseLog l;
    public SavingsAccount(DatabaseLog log)
    {
        //Violating Dependency Inversion
        l=log;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Amount credited to Savings Account is "+amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Amount debited from Savings Account is "+amount);
    }

    @Override
    public void print_balance() {
        System.out.println("In Savings Account..");
        l.show_balance();
    }
}
