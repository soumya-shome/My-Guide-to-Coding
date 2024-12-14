import java.util.*;
class seven
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int b=1;
        while(n!=0)
        {
            int d=n%10;
            b=b*d;
            n=n/10;
        }
        System.out.println("Product"+b);
    }
}