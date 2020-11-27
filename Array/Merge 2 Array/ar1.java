import java.util.*;
class ar1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the number of elements for 1st array");
        int m=sc.nextInt();
        System.out.println("Enter a the number of elements for 2nd array");
        int n=sc.nextInt();
        
        int a[]=new int[m];
        int b[]=new int[n];
        System.out.println("Enter the Elements for the 1st array");
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Elements for the 2nd array");
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int c[]=new int [m+n];
        sc.close();
        int t=0;
        for(int i=0;i<(m+n);i++)
        {
            if(i<m)
                c[i]=a[i];
            else
            {
                c[i]=b[t];
                t++;
            }
        }
        for(int i=0;i<(m+n);i++)
        {
            System.out.print(c[i]+",");
        }
    }
}
