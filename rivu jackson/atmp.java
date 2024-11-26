import java.util.*;
public class atmp
{
    public int atmp1(int a)
    {
        int a1 = a;
        int b = 0;
        while(a1!=0)
        {
            b++;
            a1=a1/10;
        }
        int p=(int)Math.pow(10,b);
        int d = (int)Math.pow(a,2);
        if(d%p==a)
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
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int a = SC.nextInt();
        atmp obj = new atmp();
        int m = obj.atmp1(a);
        if(m==1)
        {
            System.out.println("automorphicccc");
        }
        else
        {
            System.out.println("automorphicccc na");
        }
    }
}