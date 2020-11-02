import java.util.*;
class Bouncy
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        // int n = sc.nextInt();
        for(int n=1;n<=150;n++)
        {
            System.out.println(n+" ");
            String s = Integer.toString(n);
            char ch;
            int f = 0;
            for(int i=0; i<s.length()-2; i++)
            {
                ch = s.charAt(i);
                if((ch>=s.charAt(i+1) && ch<=s.charAt(i+2)))// If any digit is more than next digit then we have to stop checking
                {
                    System.out.print(" "+f+"++"+" f="+(++f));
                }
                if((ch<=s.charAt(i+1) && ch>=s.charAt(i+2)))
                {
                    System.out.print(" "+f+"+++"+" f="+(++f));
                }
            }
            if(f==0)
            {
                System.out.print("Bouncy");
            }
            //if(f==0)
            //{
            // System.out.println("f="+f);
            //}
            //  else 
            //  {
            //     System.out.println("Not Bouncy"+"f="+f);
            //  }
        }
    }
}