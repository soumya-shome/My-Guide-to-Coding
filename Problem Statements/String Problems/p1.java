import java.util.*;
public class p1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word");
        String n=sc.next();//String n=sc.nextLine();
        int l=n.length();
        for(int i=0;i<l;i++)
        {
            char a=n.charAt(i);
            int ch=(int)a;
            char a2=(char)(ch+1);
            System.out.print(a2);
            /**
             * 
             * if(a!=' ')
            {
                int ch=(int)a;
                char a2=(char)(ch+1);
                System.out.print(a2);
            }else{
                System.out.print(a);
            }
             */
        }
    }
}