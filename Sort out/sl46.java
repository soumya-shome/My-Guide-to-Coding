import java.util.*;
class sl46
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        int l1=s.length();
        int a=0;
        for(int i=0;i<l1;i++)
        {
            char c1=s.charAt(i);
            if(c1==' ')
            {
                a++;
            }
        }
        String s2[]=new String[a];
        System.out.println("Enter the place of 2 word to be changed");
        int n=sc.nextInt();
        int n2=sc.nextInt();
        n--;
        n2--;
        int a2=0;
        String s3=" ";
        for(int j=0;j<l1;j++)
        {
            char c2=s.charAt(j);
            if(c2!=' ')
            {
                s3=s3+c2;
            }
            else
            {
                s2[a2]=s3;
                a2++;
                s3=" ";
            }
        }
        
        String t1=" ";
        int l3=(s2[n]).length();
        for(int i4=0;i4<l3;i4++)
        {
            char c4=s2[n].charAt(i4);
            int p1=(int)c4;
            p1++;
            char t=(char)p1;
            t1=t1+t;
        }
        s2[n]=t1;
        
        System.out.println(s2[n]);
        for(int i2=0;i2<a;i2++)
        {
            System.out.println(s2[i2]);
        }
    }
}       