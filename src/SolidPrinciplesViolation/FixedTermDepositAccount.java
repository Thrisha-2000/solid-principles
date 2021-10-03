package SolidPrinciplesViolation;

public class FixedTermDepositAccount implements Account{
    DatabaseLog l;
    public FixedTermDepositAccount(DatabaseLog log)
    {
        //Violating Dependency Inversion
        l=log;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Amount credited to Fixed Term Deposit Account is "+amount);
    }

    @Override
    public void withdraw(double amount) {
        //Violating Liskov Substitution principle
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
    }

    @Override
    public void print_balance() {
        System.out.println("In Fixed Term Deposit Account...");
        l.show_balance();
    }
}
