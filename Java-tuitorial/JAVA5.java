import java.util.*;
class JAVA5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.next();
        int l=s.length();
        String s2="";
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                s2=s2+c;
            }
        }
        System.out.println(s2);
        int l2=s2.length();
        for(int i=0;i<l2;i++)
        {
            char c2=s2.charAt(i);
            System.out.print(s2.substring(0,i+1));
            for(int j=i+1;j<l2;j++)
            {
                System.out.print(c2);
            }
            System.out.println();
        }
    }
}