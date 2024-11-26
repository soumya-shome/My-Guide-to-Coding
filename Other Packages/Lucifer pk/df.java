import java.util.*;
class df
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last term");
        int n=sc.nextInt();
        int a=4;
        double s=0.0;
        for(int i=1;i<=n;i++)
        {
            s=s+(1/(double)a);
            System.out.println(s);
            a+=4;
        }
    }
}
