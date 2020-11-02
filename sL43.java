import java.util.*;
class sL43
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 20 no.s");
        int a[]=new int [20];
        for(int i=0;i<20;i++)
        {
            a[i]=sc.nextInt();
        }
        int b=0,c=0,d=0,e=0;
        for(int j=0;j<20;j++)
        {
            if(a[j]<0)
            {
                if(a[j]%2!=0)
                {
                    b=b+a[j];
                    
                }
                else
                {
                    c=c+a[j];
                }
            }
            else
            {
                if(a[j]%2!=0)
                {
                    d=d+a[j];
                    
                }
                else
                {
                    e=e+a[j];
                }
            }
        }
        System.out.println("a.="+b);
        System.out.println("b.="+c);
        System.out.println("c.="+d);
        System.out.println("d.="+e);
    }
}