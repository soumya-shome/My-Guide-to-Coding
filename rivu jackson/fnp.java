import java.util.*;
public class fnp
{
    public int pallin(int n)
    {
        int n2 = n;
        int b = 0; 
        while(n!=0)
        {
            int c = n%10;
            b = b*10+c;
            n = n/10;
        }
        if(n2==b)
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
        fnp obj = new fnp();
        System.out.println("enter a number");
        int n = SC.nextInt();
        if(obj.pallin(n)==1)
        {
            System.out.println("pallindromre");
        }
        else
        {
            System.out.println("not a pallindrome");
        }
    }
}