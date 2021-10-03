package SolidPrinciplesSatisfied;

public class PrintDetails implements PrintBalance{
    ShowBalance l;
    PrintDetails(ShowBalance log){
        l=log;
    }
    @Override
    public void print_balance() {
        l.show_balance();
    }
}
