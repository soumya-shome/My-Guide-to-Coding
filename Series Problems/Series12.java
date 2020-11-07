import java .util.*;
class Series12
{
    public static void meth()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the no. of terms");
        int n=sc.nextInt();
        int s=1;
        System.out.print(s+",");
        for(int i=1;i<=n;i++)
        {
            s=s+i;
            System.out.print(s+",");
        }
    }
}