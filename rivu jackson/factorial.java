import java.util.*;
class factorial
{
    public static void main()
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int a = SC.nextInt();
        int j = 1;
        for(int i=1;i<=a;i++)
        {
            j=j*i;
        }
        System.out.println( j );
    }
}