import java.util.*;
class PallinSentence
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s=sc.nextLine();
        s=s+" ";
        String s3=s;
        String s1="",s2="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char e=s.charAt(i);
            if(e!=' ')
            {
                s1=s1+e;
            }
            else
            {
                s2=s1+" "+s2;
                s1="";
            }
        }
        if(s3.equalsIgnoreCase(s2))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
        
    }
}