import java.util.*;
class pallindrom_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word");
        String n=sc.next();
        n=n.toLowerCase();
        int l=n.length();
        String po="";
        for(int i=0;i<l;i++)
        {
            char a=n.charAt(i);
            po=a+po;
        }
        if(n.equalsIgnoreCase(po))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
    }
}