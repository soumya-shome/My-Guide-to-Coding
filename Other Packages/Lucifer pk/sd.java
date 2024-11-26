import java.util.*;
class sd
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        String s1="";
        int l=s.length();
        for (int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                s1=s1+c;
            }
            else
            {
                int l2=s1.length();
                char a=s1.charAt(0);
                char b=s1.charAt(l2-1);
                if(a=='A'|| a=='E'|| a=='I'|| a=='O'|| a=='U')
                {
                    if(b!='A'|| b!='E'|| b!='I'|| b!='O'|| b!='U') 
                    {
                        System.out.println(s1);
                    }
                }
                s1="";
            }
            
        }
    }
}
        
