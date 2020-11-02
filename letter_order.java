import java.util.*;
class letter_order
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
        String s3="";
        char a=s2.charAt(0);
        char b=s2.charAt(l-1);
        int a2=(int)a;
        a2++;
        int b2=(int)b;
        int p=1;
        for(int h=a2;h<b2;h++)
        {
            char t=s2.charAt(p);
            char e=(char)h;
            if(t!=e)
            {
                s3=s3+e;

            }
            else
            {
                p++;
            }

        }
        System.out.println(s3);
    }
}
