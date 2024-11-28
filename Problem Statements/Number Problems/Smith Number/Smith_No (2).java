import java.util.*;
class SmithNo
{

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        int n1=n;
        int s=0;
        while(n1>0)
        {
            s=s+n1%10;
            n1=n1/10;
        }
        int n2=n;
        int i=2, sum=0;
        while(n2>1)
        {
            if(n2%i==0)
            {
                int t=0;
                n1=i;
                while(n1>0)
                {
                    t=t+n1%10;
                    n1=n1/10;
                }
                sum=sum+t; //Here 'i' is the prime factor of 'n' and we are finding its sum
                n2=n2/i;
            }
            else
                i++;
        }
        System.out.println("s="+s);
        System.out.println("sum="+sum);
        if(s==sum)
            System.out.print("It is a Smith Number");
        else
            System.out.print("It is Not a Smith Number");
    }
}