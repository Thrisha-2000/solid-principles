package SolidPrinciplesViolation;

public class BankingAppWithdrawalService{
    public Account account;
    public BankingAppWithdrawalService(Account account)
    {
        this.account=account;
    }
    public void withdraw(double amount)
    {
        account.withdraw(amount);
    }

}
