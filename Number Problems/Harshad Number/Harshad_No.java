import java.util.*;
class HarshadNo
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        int n1=n;
        int b=0;
        while(n1>0)
        {
            int a=n1%10;
            b=b+a;
            n1=n1/10;
        }
        if(n%b==0)
        {
            System.out.println("Harshad no.");
        }
        else
        {
            System.out.println("Not Harshad");
        }
    }
}