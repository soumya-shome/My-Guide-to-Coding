import java .util.*;
class Series6
{
    public static void meth()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the no. of terms");
        int n=sc.nextInt();
        int e=2;
        System.out.print(e+",");
        int f=3;
        for(int i=1;i<=n;i++)
        {
            e=e+f;
            System.out.print(e+",");
            f+=2;
        }
    }
}