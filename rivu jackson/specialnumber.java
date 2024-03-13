import java.util.*;
public class specialnumber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        while(a!=0)
        {
            int d=a%10;
            
            System.out.println(d);
            a=a/10;
        }
    }
}