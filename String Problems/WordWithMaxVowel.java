import java.util.*;
class WordWithMaxVowel
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String n=sc.nextLine();
        sc.close();
        n=n.toUpperCase();
        n=n+" ";
        int l=n.length();
        String s2="",s1="";
        int max=0;
        int a=0;
        for(int i=0;i<l;i++)
        {
            char c=n.charAt(i);
            if(c!=' ')
            {
                s1=s1+c;
            }
            else
            {
                int l2=s1.length();
                for(int j=0;j<l2;j++)
                {
                    char c2=s1.charAt(j);
                    if(c2=='A' ||c2=='E' ||c2=='I' ||c2=='O' ||c2=='U')
                    {
                        a++;
                    }
                }
                if(a>max)
                {
                    s2=s1;
                    max=a;
                }
                s1="";
                a=0;
            }
        }
        System.out.println("The word with maximum vowels is "+s2);
    }
}
