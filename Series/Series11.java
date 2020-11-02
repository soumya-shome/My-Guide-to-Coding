import java.util.*;
class Series11
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n=sc.nextInt();
        int i=1,n1=n;
        int s=0;
        do
        {
            int d=n1%10;
            int p=(int)Math.pow(d,2);
            s=s+p;
            n1=n1/10;
            i++;
        }
        while(i<=n);
        System.out.println(s);
    }
}