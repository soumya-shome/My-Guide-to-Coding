//first letter of each word to upper case
import java.util.*;
class ToUpperCase
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s=sc.nextLine();
        int l=s.length();
        char x2=Character.toUpperCase(s.charAt(0));
        System.out.print(x2);
        for(int i=1;i<l;i++)
        {
            char a=s.charAt(i);
            if(a==' ')
            {
                char o=s.charAt(i+1);
                char z=Character.toUpperCase(o);
                System.out.print(" "+z);
                i++;
            }
            else
            {
                System.out.print(a);
            }
        }
    }
}