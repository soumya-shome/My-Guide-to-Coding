import java.util.*;
class lso
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        int l=s.length();
        String s1="";
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(Character.isLetter(c))
            {
                System.out.print(c);
            }
            else
            {
                char y=s.charAt(i+1);
                if(c!=y)
                {
                    System.out.print(c);
                }
            }
        }
    }
}