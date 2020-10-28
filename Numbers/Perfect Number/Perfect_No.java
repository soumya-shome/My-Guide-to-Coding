import java.util.*;
class PerfectNo
{
    public static void meth()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int i=1,s=0,n1=n;
        do
        {
            int y=n1%i;
            if(y==0)
            {
                s=s+i;
            }
            i++;
        }
        while(i<n);
        if(n==s)
        {
            System.out.println("Perfect");
        }
        else
        {
            System.out.println("not Perfect");
        }
    }
}
        