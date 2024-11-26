import java.util.*;
class pallindrome
{
    public static void main()
    {
     Scanner SC = new Scanner (System.in);
     System.out.println("enter a number");
     int a = SC.nextInt();
     int b = 0; 
     while(a!=0)
     {
         int c = a%10;
          b = b*10+c;
          a = a/10;
     }
     System.out.println("reverse number"+b);
    }
}