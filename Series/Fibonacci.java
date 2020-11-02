import java.util.*;
class Fibonacci
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n=sc.nextInt();
        int i=1;
        int a=0;
        int b=1;
        System.out.print(a+","+b+",");
        if (n>2)
        {
            do
            {
                int c=a+b;
                System.out.print(c+",");
                a=b;
                b=c;
                i++;
            }
            while(i<=(n-2));
        }
    }
}