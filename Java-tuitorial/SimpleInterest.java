class SimpleInterest
{
    public static void main(int p,int r,int t)
    {
        double interest=(p*r*t)/100;
        double amount = p + interest;
        System.out.println("Amount :"+amount);
        System.out.println("Interest :"+interest);
    }
}