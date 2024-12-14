import java.util.*;
class array_perfectsquare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of length");
        int len=sc.nextInt();
        int a[]=new int[len];
        System.out.println("Enter the values for 1st array");
        for(int i=0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<len;i++)
        {
            double f1=Math.sqrt(a[i]);
            int f2=(int)Math.floor(f1);
            int f3=(int)Math.pow(f2,2);
            if(f3-a[i]==0)
                System.out.println(a[i]+",");
        }
    }
}