import java.util.*;
public class spy
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int n2=n;
        int sum=0;
        int pro=1;
        
        while(n!=0)
        {
            int d1=n%10;
            sum=sum+d1;
            pro=pro*d1;
            n=n/10;
        }
        if(sum==pro)
        {
            System.out.println("spy number");
        }
        else
        {
            System.out.println("not a spy number");
        }
    }
}
        

        