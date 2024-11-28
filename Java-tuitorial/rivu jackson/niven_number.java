import java.util.*;
public class niven_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int n2=n;
        int sum=0;
        while(n!=0)
        {
            int d1=n%10;
            sum=sum+d1;
            n=n/10;
        }
        if(n2%sum==0)
        {
            System.out.println("niven number");
        }
        else
        {
            System.out.println("not a niven number");
        }
    }
}

