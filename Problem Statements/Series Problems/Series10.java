import java .util.*;
class Series10
{
    public static void meth()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the no. of terms");
        int n=sc.nextInt();
        for(int i=2;i<=n+1;i++)
        {
            int m=(int)Math.pow(2,i);
            System.out.print(m+",");
        }
    }
}