package SolidPrinciplesSatisfied;

public class SavingsAccount implements AccountDeposit,AccountWithdrawal{
    //Dependency Inversion satisfied
    //ShowBalance l;
    //SavingsAccount(ShowBalance log)
    //{
     //   l=log;
       // l.show_balance();
    //}

    @Override
    public void deposit(double amount) {
        System.out.println("Amount credited to Savings Account "+amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Amount debited from Savings Account "+amount);
    }

}
