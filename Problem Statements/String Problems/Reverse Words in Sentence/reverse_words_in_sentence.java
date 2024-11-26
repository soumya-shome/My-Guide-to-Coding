import java.util.*;
class WordReverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s=sc.nextLine();
        sc.close();
        s=s+" ";
        String s1="",s2="";
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
                for(int j=l2-1;j>=0;j--)
                {
                    char z=s1.charAt(j);
                    s2=s2+z;
                }
                s1="";
                System.out.print(" "+s2);
                s2="";
            }
        }
    }
}
