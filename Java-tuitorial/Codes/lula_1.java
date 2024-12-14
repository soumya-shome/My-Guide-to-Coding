import java.util.*;
class lula_1
{
    public static void main()
    {
     Scanner SC = new Scanner (System.in);
     System.out.println("enter a number");
     int a = SC.nextInt();
     int sum = 0;
     while(a!=0)
     {
         int d = a%10; 
         sum =sum+d;
         a = a/10;
     }
     System.out.println("sum of digits"+sum);
    }
}