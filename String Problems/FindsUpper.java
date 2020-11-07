/*Finds upper and lower case letters from the first and the last word*/
import java.util.*;
class FindsUpper
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        int l1=s.length();
        int sp=0;
        for(int i=0;i<l1;i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                sp++;
            }
        }
        String s2[]=new String[sp];
        String t=" ";
        int p=0;
        int y=0;
        for(int j=0;j<l1;j++)
        {
            char c2=s.charAt(j);
            if(c2!=' ')
            {
                t=t+c2;
            }
            else
            {
                s2[p]=t;
                y++;
                p++;
                t="";
            }
        }
        String s3=s2[0];
        s2[0]=s2[sp-1];
        s2[sp-1]=s3;

        int u2=0,u3=0;
        for(int u=0;u<sp;u++)
        {
            System.out.print(s2[u]+" ");
        }
        System.out.println();
        int l3=s2[0].length();
        for(int k=0;k<l3;k++)
        {
            char e=s2[0].charAt(k);
            if(Character.isUpperCase(e)==true)
            {
                u2++;
            }
        }
        int l4=s2[sp-1].length();
        for(int k2=0;k2<l4;k2++)
        {
            char e2=s2[sp-1].charAt(k2);
            if(Character.isUpperCase(e2)==true)
            {
                u3++;
            }
        }
        System.out.println("No. of letter in upperCase in the first word is "+u2);
        System.out.println("No. of letter in upperCase in the last word is "+u3);
    }
}

