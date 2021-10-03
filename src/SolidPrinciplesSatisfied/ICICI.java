package SolidPrinciplesSatisfied;

//Open closed principle satisfied
public class ICICI implements Bank{
    ICICI()
    {
        System.out.println("Using ICICI account for loan");
    }

    @Override
    public double getInterest() {
        return 5;
    }
}
