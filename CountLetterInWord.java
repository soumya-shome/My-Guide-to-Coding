import java.util.*;
class CountLetterInWord
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s=sc.nextLine();
        s=s+" ";
        String s1="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char x=s.charAt(i);
            if(x!=' ')
            {
                s1=s1+x;
            }
            else
            {
                int l2=s1.length();
                System.out.println(s1+"="+l2);
                s1="";
            }
        }
    }
}