package SolidPrinciplesSatisfied;

public class CurrentAccount implements AccountDeposit,AccountWithdrawal{
    //Dependency Inversion satisfied
    //ShowBalance l;
    //CurrentAccount(ShowBalance log)
    //{
     //   l=log;
      //  l.show_balance();
    //}

    @Override
    public void deposit(double amount) {
        System.out.println("Amount credited to Current Account "+amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Amount debited from Current Account "+amount);
    }

}
