import java.util.*;
class pallindrom_string

{
    public static void meth()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word");
        String n=sc.next();
        n=n.toUpperCase();
        System.out.println(n);
        String n2=n;
        int l=n.length();
        String po="";
        for(int i=0;i<l;i++)
        {
            char a=n.charAt(i);
            po=a+po;
        }
        if(n2.equalsIgnoreCase(po))
        {
            System.out.println("YEssss");
        }
        else
        {
            System.out.println("Noo");
        }
    }
}