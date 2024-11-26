import java.util.*;
class power_4
{
    public static void main()
    {
        Scanner SC = new Scanner (System.in);
        System.out.println("enter a number");
        int n = SC.nextInt();
        System.out.println("enter another number");
        int x = SC.nextInt();
        int c = 1;
        double m = 1;
        for(int i=1;i<n;i++)
        {
            m = m+(Math.pow(x,c)/Math.pow(c,2));
            c++;
        }
        System.out.println(m);
    }
}