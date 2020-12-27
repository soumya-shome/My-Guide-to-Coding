import java.util.*;
class array2
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no,");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=0;
        int p=0;
        int lb=0;
        int ub=9;
        System.out.println("Enter no. to be searched");
        int ns=sc.nextInt();
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(a[p]<ns)
                lb=p+1;
            if(a[p]>ns)
                ub=p-1;
            if(a[p]==ns)
            {
                k=1;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("NO. found ");
        }
        else
        {
            System.out.println("NOT found");
        }
    }
}