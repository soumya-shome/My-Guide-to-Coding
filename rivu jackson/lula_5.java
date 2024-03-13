import java.util.*;
class lula_5
{
    public static void main()
    {
        Scanner SC = new Scanner (System.in);
        System.out.println("enter a number");
        int a = SC.nextInt();
        int b = 0;
        int d = a;
        while(a!=0)
        {
            int c = a%10;
            b = b*10+c;
            a = a/10;
        }
        if(d==b)
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("not pallindrome");
        }

    }
}