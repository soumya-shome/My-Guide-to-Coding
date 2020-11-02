//to check wether the first letters of a sentence adds up to be a pallinsdrome
//example
//This Is Java
//(JIT) reverse of (TIJ)
//tij is pllindrome
import java.util.*;
class SentePallin
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String n=sc.nextLine();
        n=n+" ";
        int l=n.length();
        String s2="",s1="";
        for(int i=0;i<l;i++)
        {
            char c=n.charAt(i);
            if(c!=' ')
            {
                s1=s1+c;
            }
            else
            {
                char c2=s1.charAt(0);
                s2=s2+c2;
                s1="";
            }
        }
        System.out.println(s2);
        String s3="";
        int l2=s2.length();
        for(int j=0;j<l2;j++)
        {
            char c3=s2.charAt(j);
            s3=c3+s3;
        }
        System.out.println(s3);
        if(s2.equalsIgnoreCase(s3))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
    }
}
    
