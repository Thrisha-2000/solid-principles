package SolidPrinciplesSatisfied;

public class Main {
    public static void main(String[] args)
    {
        ShowBalance textlog=new TextLog();
        textlog.show_balance();
        ShowBalance log_a=new DatabaseLog(40000);
        PrintDetails current_acc=new PrintDetails(log_a);
        current_acc.print_balance();
        CurrentAccount a=new CurrentAccount();
        BankingAppWithdrawableService d=new BankingAppWithdrawableService(a);
        d.withdraw(10000);

        ShowBalance log_b=new DatabaseLog(50000);
        PrintDetails savings_acc=new PrintDetails(log_b);
        savings_acc.print_balance();
        SavingsAccount b=new SavingsAccount();
        BankingAppWithdrawableService e=new BankingAppWithdrawableService(b);
        e.withdraw(20000);

        ShowBalance log_c=new DatabaseLog(60000);
        PrintDetails fixed_acc=new PrintDetails(log_c);
        fixed_acc.print_balance();
        FixedTermDepositAccount c=new FixedTermDepositAccount();
        BankingAppWithdrawableService f=new BankingAppWithdrawableService(c);
        f.withdraw(10000);

        Bank sbi=new SBI();
        double interest_sbi=sbi.getInterest();
        System.out.println("Interest rate of sbi bank is "+interest_sbi+" percent");

    }
}
