import java.util.*;
class sssss
{
    public static void meth()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word");
        String s=sc.nextLine();
        s=s.toUpperCase();
        String s2="";
        int l=s.length();

        for(int i=64;i<=90;i++)
        {
            char c=(char)i;
            for(int j=0;j<l;j++)
            {
                char c2=s.charAt(j);
                if(c==c2)
                {
                    s2=s2+c;
                }
            }
        }
        System.out.println(s2);
        char a=s2.charAt(0);
        int a1=(int)a;
        char b=s2.charAt(l-1);
        int b1=(int)b;
        System.out.println(a+" "+b);
        int f=b1-a1;
        String s3="";
        for(int u=1;u<l-1;u++)
        {
            char v=s2.charAt(u);
            for(int q=a1+1;q<f;q++)
            {
                char r=(char)q;

                if(v==r)
                {
                    s3=s3+r;
                    
                }
                System.out.println("Found"+r);
            }
            
        }
        System.out.println(s3);
    }
}
