import java .util.*;
class a5
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
        int n1=n;
        if(n1>1000)
        {
            int a2=n/1000;
            a=a2;
            
        }
        n=n%(a*1000);
        if(n1<1000)
        {
            int b2=n/100;
            if(b2>=5)
            {
                int c2=b2-5;
                c=c2;
                b=1;
            }
            else
            {
                c=b2;
            }
            n=n%100;
        }
        System.out.println("1000 * "+a+"="+(a*1000));
        System.out.println("500 * "+b+"="+(b*500));
        System.out.println("100 * "+c+"="+(c*100));
    }
}

            