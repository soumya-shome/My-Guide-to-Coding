import java.util.*;
class power_3
{
    public static void main()
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int n = SC.nextInt();
        System.out.println("enter another number");
        int x = SC.nextInt();
        int c = 2;
        double m = 1;
        for(int i=1;i<n;i++)
        {
            m = m+x/c;
            c=c+1;
        }
        System.out.println(m);
    }
}