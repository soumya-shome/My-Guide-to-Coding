import java.util.*;
public class automorphic_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n2 = n;
        int d = 0;
        while(n2!=0)
        {
            d++;
            n2=n2/10;
        }
        int a=(int)Math.pow(10,d);
        int b=(int)Math.pow(n,2);
        if(b%a==n)
        {
            System.out.println("automorphic");
        }
        else
        {
            System.out.println("automorphicccc na");
        }
    }
}