public class PallindromeNo
{
    public static void meth(int n)
    {
        int a=n;
        int b=0,r=0;
        while(n!=0)
        {
            b=n%10;
            r=r*10+b;
            n=n/10;
        }
        if(r==a)
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
    }
}
        