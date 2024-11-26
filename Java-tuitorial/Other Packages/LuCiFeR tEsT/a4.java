import java .util.*;
class a4
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        for(int j=97;j<=122;j++)
        {
            char c2=(char)j;
            int f=0;
            for(int i=0;i<l;i++)
            {
                char c=s.charAt(i);
                
                
                if(c==c2)
                {
                    f++;
                }
            }
            if(f>0)
            {
                System.out.println(c2+("\t\t")+f);
            }
        }
    }
}
