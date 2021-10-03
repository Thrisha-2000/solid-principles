package SolidPrinciplesSatisfied;

public class SBI implements Bank{
    SBI()
    {
        System.out.println("Using SBI account for loan");
    }

    @Override
    public double getInterest() {
        return 3;
    }
}
