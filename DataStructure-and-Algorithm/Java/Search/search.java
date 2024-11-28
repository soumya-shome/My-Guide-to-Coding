import java.util.*;
class search
{
    public static void meth( )
    {
        Scanner sc=new Scanner(System.in);
        int a[ ]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter no.");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the no. to be searched");
        int n=sc.nextInt();
        int l=0,u=10,m=0,f=0;
        while(l<=u)
        {
            m=(l+u)/2;
            if(n>a[m])
            {
                l=m+1;
            }
            else if(n<a[m])
            {
                u=m-1;
            }
            else if(n==a[m])
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("no. found at portion "+(m+1));
        }
        else
        {
            System.out.println("not found");
        }
    }
}