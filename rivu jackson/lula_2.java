import java.util.*;
class lula_2
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
         sum = sum+(int)Math.pow(d,3);
         //sum =sum+(d*d*d);
         a = a/10;
     }
     System.out.println("sum"+sum);
    }
}