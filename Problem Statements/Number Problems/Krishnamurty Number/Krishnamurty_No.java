import java.util.*;
class KrishnamurtyNo
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=n;
        int s=0;
        while(n>0)
        {
            int t=n%10;
            int f=1;
            for(int i=1;i<=t;i++)
            {
                f=f*i;
            }
            s=s+f;
            n=n/10;
        }
        if(s==a)
        {
            System.out.println(s+"is a krishnamurty");
        }
        else
        {
            System.out.println(s+"is not a krishnamurty");
        }
    }
}