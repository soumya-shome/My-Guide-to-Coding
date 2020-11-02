import java.util.*;
class PiglatinWords
{
    public  void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of phrases");
        int n=sc.nextInt();
        String s2="";
        int i=0;
        String s="";
        while(i!=n)
        {
            System.out.println("Enter your phrase");
            s=sc.next();
            s=s.trim();
            s=s+" ";
            int l=s.length();
            char c3=' ';
            work(s);
            i++;
        }
    }

    void vowel(String s5)
    {
        System.out.print(" "+s5+"yay");
    }

    void nonvowel(String s6)
    {
        int h=0;
        String c2="",f="";
        int l2=s6.length();
        for(int k=0;k<l2;k++)
        {
            char k2=s6.charAt(k);
            if(k2!='a' && k2!='e' && k2!='i' && k2!='o' && k2!='u')
            {
                c2=c2+k2;
            }
            else
            {
                h=k;
                break;
            }
        }
        f=s6.substring(h,l2);
        f=f+c2+"ay";
        System.out.println(" "+f);
    }

    void work(String s)
    {
        String s2="";
        int l=s.length();
        for(int j=0;j<l;j++)
        {
            char c=s.charAt(j);
            if(c!=' ')
            {
                s2=s2+c;
            }
            else
            {
                char c3=s2.charAt(0);
                if(c3=='a'||c3=='e'||c3=='i'||c3=='o'||c3=='u')
                {
                    vowel(s2);
                }
                else
                {
                    nonvowel(s2);
                }
                s2="";                    
            }
        }
    }
    static void main()
    {
        PiglatinWords obj=new PiglatinWords();
        obj.meth();
        
    }
}