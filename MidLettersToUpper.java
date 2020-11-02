import java .util.*;
class MidLettersToUpper
{
    public static void math()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s.trim();
        s=s.toUpperCase();
        s=s+" ";
        int l=s.length();
        String s2="";
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                s2=s2+c;
            }
            else
            {
                int l2=s2.length();
                String s3="";
                for(int j=0;j<l2;j++)
                {
                    char c2=s2.charAt(j);
                    if(j==0 || j==(l2-1))
                    {
                        c2=Character.toLowerCase(c2);
                        s3=s3+c2;
                    }
                    else
                    {
                        s3=s3+c2;
                    }
                }
                System.out.print(s3+" ");
                s2="";
            }
        }
    }
}