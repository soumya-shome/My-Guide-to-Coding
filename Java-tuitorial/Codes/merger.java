import java.util.*;
class merger{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[10];
        int c[]=new int[15];
        System.out.println("Enter the values for 1st array");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the values for 2nd array");
        for(int i=0;i<10;i++)
        {
            b[i]=sc.nextInt();
        }
        int ad=0;
        for(int i=0;i<5;i++)
        {
            c[ad]=a[i];
            ad++;
        }
        for(int i=0;i<10;i++)
        {
            c[ad]=b[i];
            ad++;
        }
        System.out.println("The 3rd array :");
        for(int i=0;i<15;i++)
        {
            System.out.print(c[i]+",");
        }
    }
}