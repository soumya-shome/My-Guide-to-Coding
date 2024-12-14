import java.util.*;
class sdf
{
    
    double meth(double i,int j)
    {
        double d=i-j;
        return d;
    }
    int meth(int n,int m)
    {
        int c=m+n;
        return c;
    }
    int meth(int k)
    {
        int e=k+k;
        return e;
    }
    public void inout()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no.");
        int p=sc.nextInt();
        int p2=sc.nextInt();
        int o=meth(p,p2);
        System.out.println(o);
    }
    public static void main()
    {
        sdf ob=new sdf();
 
        ob.inout();
    }
}