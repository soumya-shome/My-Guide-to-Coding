import java.util.*;
class slo
{
    public static int isPrime(int n)
    {
        int q=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                q++;
            }
        }
        if(q==1)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }

    public static void main()
    {
        int t[]=new int[20];
        int a=0;
        int b=1;
        int c;
        for(int i=2;i<20;i++)
        {
            c=a+b;
            int r=isPrime(c);
            if(r==1)
            {
                t[i]=c;
            }
            a=b;
            b=c;
            c=0;
        }
        for(int j=2;j<20;j++)
        {
            if(t[j]>0)
            {
                System.out.print(t[j]+",");
            }

        }
    }
}