import java.util.*;
class binarySearch
{
    public static void meth()
    {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 no.s");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter no. to be searched");
        int n=sc.nextInt();
        int l=0,u=9,m=0,f=0;
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
            System.out.println("No. found at position "+(m+1));
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
