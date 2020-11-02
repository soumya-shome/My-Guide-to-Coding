//change the first letter of each word to it's corresponding letter
import java.util.*;
class FirstLetterChange
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s.toUpperCase();
        s=s+" ";
        int l=s.length();
        String s1="";
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                s1=s1+c;
            }
            else
            {
                int l2=s1.length();
                char c3=s1.charAt(0);
                int n=(int)c3;
                n++;
                char r=(char)n;
                System.out.print(r);
                for(int j=1;j<l2;j++)
                {
                    char c2=s1.charAt(j);
                    System.out.print(c2);
                }
                System.out.print(" ");
                s1="";
            }
        }
    }
}
        