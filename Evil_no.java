import java.util.*;
class Evil_no

{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        int n1=n;
        String s="";
        char d[]={'0','1'};
        while(n1>0)
        {
            int a=n1%2;
            s=d[a]+s;
            n1=n1/2;
        }
        int l=s.length();
        int p=0;
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c=='1')
            {
                p++;
            }
        }
        if(p%2==0)
        {
            System.out.println("Binary Equivalent = "+s);
            System.out.println("No. of 1's ="+p);
            System.out.println("Evil no.");
        }
        else
        {
            System.out.println("Binary Equivalent = "+s);
            System.out.println("No. of 1's ="+p);
            System.out.println("Not Evil");
        }
    }
}