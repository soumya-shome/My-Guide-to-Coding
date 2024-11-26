import java.util.*;
class JAVA23
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s=sc.next();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                char c=s.charAt(j);
                System.out.print(c);
            }
            for(int k=0;k<i;k++)
            {
                char c=s.charAt(k);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}