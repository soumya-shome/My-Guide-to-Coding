import java.util.*;
class array_2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of length");
        int len=sc.nextInt();
        int a[][]=new int[len][len];
        int b[][]=new int[len][len];
        int c[][]=new int[len][len];
        System.out.println("Enter the values for 1st array");
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the values for 2nd array");
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        
        System.out.println("The sum of 2 array :");
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}