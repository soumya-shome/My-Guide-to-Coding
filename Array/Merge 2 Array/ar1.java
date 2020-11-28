import java.util.*;
class ar1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements for 1st array : ");
        int n1=sc.nextInt();
        System.out.println("Enter number of elements for 2nd array : ");
        int n2=sc.nextInt();
        
        int a[]=new int[n1];
        int b[]=new int[n2];
        System.out.println("Enter "+n1+" for the 1st array : ");
        for(int i=0;i<n1;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter "+n2+" for the 2nd array : ");
        for(int i=0;i<n2;i++)
            b[i]=sc.nextInt();
        int c[]=new int [n1+n2];
        sc.close();
        int t=0;
        for(int i=0;i<(n1+n2);i++){
            if(i<m)
                c[i]=a[i];
            else
            {
                c[i]=b[t];
                t++;
            }
        }
        for(int i=0;i<(n1+n2);i++)
        {
            System.out.print(c[i]+",");
        }
    }
}
