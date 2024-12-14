import java.util.Scanner;
class fibonacci
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,n,sum=0;
        System.out.println("Enter the number of terms : ");
        n=sc.nextInt();
        if(n==1)
            //System.out.print(a);
            sum=a;
        else if (n==2)
            //System.out.print(a+","+b);
            sum=a+b;
        else
        {
            sum=a+b;//1
            //System.out.print(a+","+b+",");
            for(int i=3;i<=n;i++)
            {
                c=a+b;
                sum=sum+c;
                //System.out.print(c+",");
                a=b;
                b=c;
            }
        }
        System.out.print(sum);
    }
}