import java.util.*;
class power_2
{
    public static void main()
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int n = SC.nextInt();
        int c = 1;
        int e = 2;
        int m = 0;
        for(int i=1;i<=n;i++)
        {
            m = m+(int)Math.pow(c,e);
            c = c+1;
            e = e+1;
        }
        System.out.println(m);
    }
}