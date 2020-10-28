import java.util.*;
class PronicNo

{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        int a=0;
        for(int i=1;i<=n;i++)
        {
            int b=i*(i+1);
            if(b==n)
            {
                a++;
            }
        }
        if(a>=1)
        {
            System.out.println("Pronic no.");
        }
        else
        {
            System.out.println("Not pronic");
        }
    }
}