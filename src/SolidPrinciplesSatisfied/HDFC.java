package SolidPrinciplesSatisfied;

//Open Closed Principle satisfied
public class HDFC implements Bank{
    HDFC()
    {
        System.out.println("Using HDFC account for loan");
    }

    @Override
    public double getInterest() {
        return 6;
    }
}
