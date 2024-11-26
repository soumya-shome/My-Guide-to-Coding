import java.util.*;
class array_sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of length");
        int len=sc.nextInt();
        int a[]=new int[len];
        int b[]=new int[len];
        int c[]=new int[len];
        System.out.println("Enter the values for 1st array");
        for(int i=0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the values for 2nd array");
        for(int i=0;i<len;i++)
        {
            b[i]=sc.nextInt();
        }
        
        for(int i=0;i<len;i++)
        {
            c[i]=a[i]+b[i];
        }
        
        System.out.println("The sum of 2 array :");
        for(int i=0;i<len;i++)
        {
                System.out.print(c[i]+" ");
        }
    }
}