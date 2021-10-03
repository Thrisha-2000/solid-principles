package SolidPrinciplesViolation;

public class Main
{

    public static void main(String[] args)
    {
        Bank sbi=new SBI();
        GetInterest i=new GetInterest();
        double interest_sbi=i.getInterest(sbi);
        System.out.println("Interest rate of sbi bank is "+interest_sbi+" percent");

        DatabaseLog log_a=new DatabaseLog(40000);
        Account a=new CurrentAccount(log_a);
        a.print_balance();
        BankingAppWithdrawalService d=new BankingAppWithdrawalService(a);
        d.withdraw(10000);

        DatabaseLog log_b=new DatabaseLog(50000);
        Account b=new SavingsAccount(log_b);
        b.print_balance();
        BankingAppWithdrawalService e=new BankingAppWithdrawalService(b);
        e.withdraw(20000);

        DatabaseLog log_c=new DatabaseLog(60000);
        Account c=new FixedTermDepositAccount(log_c);
        c.print_balance();
        BankingAppWithdrawalService f=new BankingAppWithdrawalService(c);
        f.withdraw(30000);

    }
}