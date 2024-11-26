import java.util.*;
class a1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s+" ";
        s=s.toUpperCase();
        int l=s.length();
        char c=s.charAt(0);
        System.out.print(c+".");
        for(int i=0;i<(l-1);i++)
        {
            char c2=s.charAt(i);
            if(c2==' ')
            {
                char r=s.charAt(i+1);
                System.out.print(r+".");
            }
        }
    }
}