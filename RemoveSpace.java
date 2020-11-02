import java.util.*;
class RemoveSpace
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String n=sc.nextLine();
        n=n+" ";
        int l=n.length();
        String s1="",s2="",s3="",s4="";;
        int max=0;
        for(int i=0;i<l;i++)
        {
            char c=n.charAt(i);
            if(c!=' ')
            {
                s1=s1+c;
            }
            else
            {
                int l2=s1.length();
                for(int j=0;j<l2;j++)
                {
                    char c2=s1.charAt(j);
                    boolean a=Character.isUpperCase(c2);
                    if(a==true)
                    {
                        s2=s2+c2;
                    }
                    else
                    {
                        s3=s3+c2;
                    }
                }
                s4=s3+" "+s2+" ";
                s1="";
            }
        }
        System.out.println(s4);
    }
}
