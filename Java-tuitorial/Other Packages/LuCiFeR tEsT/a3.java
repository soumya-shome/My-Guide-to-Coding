import java .util.*;
class a3
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int n1=n;
        String s="";
        char a[ ]={'0','1'};
        while(n1!=0)
        {
            int d=n1%2;
            s=a[d]+s;
            n1=n1/2;
        }
        int l=s.length();
        int b=0;
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c=='1')
            {
                b++;
            }
        }
        if(b%2==0)
        {
            System.out.println("BINARY EQUIVALENT="+s);
            System.out.println("NO. OF 1’s="+b);
            System.out.println("Evil no");
        }
        else
        {
            System.out.println("BINARY EQUIVALENT="+s);
            System.out.println("NO. OF 1’s="+b);
            System.out.println("Not Evil no");
        }
    }
}