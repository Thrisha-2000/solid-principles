package SolidPrinciplesSatisfied;

//Liskov substitution principle satisfied
public class FixedTermDepositAccount implements AccountDeposit{
    //ShowBalance l;
    //FixedTermDepositAccount(ShowBalance log)
    //{
      //  l=log;
      //  l.show_balance();
    //}

    @Override
    public void deposit(double amount) {
        System.out.println("Amount credited to Fixed Term Deposit Account "+amount);
    }

}
