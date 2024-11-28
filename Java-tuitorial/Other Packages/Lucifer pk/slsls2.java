//binary to decimal
import java.util.*;
class slsls2
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int sum=0;
        int n1=n;
        int a=0;
        int t=0;
        while(n1!=0)
        {
            int l=n1%10;
            a=a+l*(int)Math.pow(2,t);
            t++;
            n1=n1/10;
        }
        System.out.println(a);
    }
}