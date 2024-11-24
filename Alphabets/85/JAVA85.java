import java.util.*;
class JAVA85
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter word");
        String q=sc.nextLine();
        int s=1;
        int l=q.length();
        for(int i=0;i<l;i++)
        {
            for(int p=1;p<=s;p++)
            {
                System.out.print(" ");
            }
            s++;
            char c=q.charAt(i);
            System.out.print(c);
            System.out.println();
        }
    }
}
