package SolidPrinciplesViolation;

public class GetInterest {
    //Violating Open Closed Principle
    public double getInterest(Bank b)
    {
        if(b instanceof SBI)
        {
            return 3;
        }
        else
        {
            if(b instanceof ICICI)
            {
                return 5;
            }
            else
            {
                return 6;
            }
        }
    }
}
