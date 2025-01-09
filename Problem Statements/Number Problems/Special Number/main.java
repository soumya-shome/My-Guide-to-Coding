import java.util.*;

class a2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        sc.close();
        int i=n%10;
        int i2=n/10;
        int a=i+i2;
        int b=i*i2;
        int c=a+b;
        if(c==n)
        {
            System.out.println("Special no.");
        }
        else
        {
            System.out.println("Not Special No.");
        }
    }
}