import java.util.*;
class ar2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the number of elements for the array");
        int m=sc.nextInt();
        
        int a[]=new int[m];
        
        System.out.println("Enter the Elements for the 1st array");
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<m;i++)
        {
            System.out.print(a[i]+", ");
        }
        System.out.println();
        System.out.println("Enter the position to be changed");
        int b=sc.nextInt();
        System.out.println("Enter the number");
        int n=sc.nextInt();
        a[b-1]=n;
        
        for(int i=0;i<m;i++)
        {
            System.out.print(a[i]+",");
        }
    }
}
