/*print the characters in alphabetical order*/
import java.util.*;
class AsceAlphaOrder
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String n=sc.nextLine();
        int l=n.length();
        sc.close();
        for(int i=97;i<=123;i++)
        {
            for(int j=0;j<l;j++)
            {
                char c=n.charAt(j);
                char d=(char)i;
                if(c==d)
                {
                    System.out.print(c);
                }
            }
        }
    }
}