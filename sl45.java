import java.util.*;
class sl45
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of sentences");
        int n=sc.nextInt();
        String a[]=new String [n+1];
        int l[]=new int[n+1];
        System.out.println("Enter the sentences in one line");
        for(int i=0;i<=n;i++)
        {
            a[i]=sc.nextLine();
            l[i]=a[i].length();
        }
        a[n]=a[n]+" ";
        for(int r=0;r<=n;r++)
        {
            System.out.println(a[r]);
        }
        
        String f="";
        String t="";
        
        for(int j=0;j<=n;j++)
        {
            for(int k=0;k<l[j];k++)
            {
                char c=a[j].charAt(k);
                if(Character.isLetter(c) || c==' ')
                {
                    if(c!=' ')
                    {
                        t=t+c;
                    }
                    else
                    {
                        f=t+" "+f;
                        t="";
                    }
                }
            }
        }
        System.out.println(f);
    }
}

