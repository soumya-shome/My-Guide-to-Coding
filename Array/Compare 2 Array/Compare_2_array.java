import java.util.*;
class Compare_2_array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int i,f=0;
        System.out.print("Enter 5 number for 1st array : ");
        for (i=0;i<5;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter 5 number for 2nd array : ");
        for (i=0;i<5;i++)
            b[i]=sc.nextInt();
        System.out.print("1st Array : ");
        for (i=0;i<5;i++)
            System.out.print(a[i]+" ");
        System.out.print("\n2nd Array : ");
        for (i=0;i<5;i++)
            System.out.print(b[i]+" ");
        for(i=0;i<5;i++)
            if(a[i]!=b[i]){
                f=1;
                break;
            }
        if(f==0)
            System.out.print("\nBoth the array are same.");
        else
            System.out.print("\nBoth the array are different.");       
    }
}