package SolidPrinciplesViolation;

public class CurrentAccount implements Account{
    DatabaseLog l;
    public CurrentAccount(DatabaseLog log)
    {
        // Violating Dependency Inversion
        l=log;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Amount credited to Current Account is "+amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Amount debited from Current Account is "+amount);
    }

    @Override
    public void print_balance() {
        System.out.println("In Current Account...");
        l.show_balance();
    }
}
