import java.util.*;
class sl44
{
    public static void meth()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter no. of terms");
        int n=sc.nextInt();
        String a="A";
        String b="B";
        String c="";
        System.out.print(a+","+b+",");
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}