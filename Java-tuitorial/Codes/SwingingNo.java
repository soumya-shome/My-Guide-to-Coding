import java.util.*;
class SwingingNo
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of variable for array");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter no.s");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int f[]=new int[n];
        for(int i1=0;i1<n;i1++)
        {
            for(int j=0;j<n-i1-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        int mid;
        if(n%2==0)
        {
            mid=n/2;
        }
        else
        {
            mid=(int)n/2;
        }
        int c=1,d=1;
        for(int k=0;k<n;k++)
        {
            if(k==0)
            {
                f[mid]=a[k];
            }
            else
            {
                if(k%2==0)
                {
                    f[mid-c]=a[k];
                    c++;
                }
                else
                {
                    d++;
                }
            }
        }
        
        System.out.println("_________________");
        for(int o=0;o<n;o++)
        {
            System.out.print(f[o]+",");
        }

    }
}