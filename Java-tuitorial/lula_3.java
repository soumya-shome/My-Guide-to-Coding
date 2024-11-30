import java.util.*;
class lula_3
{
    public static void main()
    {
     Scanner SC = new Scanner (System.in);
     System.out.println("enter a number");
     int a = SC.nextInt();
     int c = 0;
     while(a!=0)
     {
         c++;
         a = a/10;
     }
     System.out.println("number of digits"+c);
    }
}