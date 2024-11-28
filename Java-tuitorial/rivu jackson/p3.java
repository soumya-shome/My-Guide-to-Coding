import java.util.*;
public class p3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a setence");
        String n=sc.nextLine();
        int l=n.length();
        for(int i=0;i<l;i++)
        {
            char a=n.charAt(i);
            if(a!=' ')
            {
                int ch=(int)a;
                char a2=(char)(ch+1);
                System.out.print(a2);
            }else{
                System.out.print(a);
            }
        }
    }
}