import java .util.*;
class JAVA84
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Three Letter Word");
        String s=sc.nextLine();
        sc.close();
        int l=s.length();
        char c=s.charAt(0);
        char c1=s.charAt(l-1);
        System.out.print(" ");
        System.out.println(c);
        for(int i=0;i<l;i++)
        {
            char c2=s.charAt(i);
            System.out.print(c2);
        }
        System.out.println();
        System.out.print(" ");
        System.out.print(c1);
    }
}
