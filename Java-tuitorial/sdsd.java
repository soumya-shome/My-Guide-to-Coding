import java.util.*;
class sdsd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        String s =sc.next();
        s=s.toUpperCase();
        System.out.println(s);
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                int n=(int)c;
                s2=s2+(char)(n+1);
            }
            else
            {
                s2=s2+c;
            }
        }
        System.out.println(s2);
    }
}