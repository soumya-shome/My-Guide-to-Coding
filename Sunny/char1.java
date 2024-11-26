import java.util.*;
public class char1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet");
        String s=sc.nextLine();
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!='a' && c!='e' && c!='o' && c!='i' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U')
                s2=s2+c;
        }
        System.out.println(s2);
    }
}