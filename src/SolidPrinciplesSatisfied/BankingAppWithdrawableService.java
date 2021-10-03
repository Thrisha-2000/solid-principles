package SolidPrinciplesSatisfied;

public class BankingAppWithdrawableService {
    AccountWithdrawal account;
    public BankingAppWithdrawableService(AccountWithdrawal account)
    {
        this.account=account;
    }
    public void withdraw(double amount)
    {
        account.withdraw(amount);
    }
}
