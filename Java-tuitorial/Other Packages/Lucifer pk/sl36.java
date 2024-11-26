import java.util.*;
class sl36
{
    boolean isUnique(String q)
    {
        int a[]={0,0,0,0,0,0,0,0,0,0};
        int i,flag=0;
        char ch;
        for(i=0;i<q.length();i++)
        {
            ch=q.charAt(i);
            a[ch-48]++;
        }
        for(i=1;i<10;i++)
        {
            if(a[i]!=1)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        sl36 ob=new sl36();
        for(int j=100;j<=999;j++)
        {
            String b=Integer.toString(j);
            String s=Integer.toString(j*1)+Integer.toString(j*2)+Integer.toString(j*3);
            if(ob.isUnique(s))
            {
                System.out.println("Fascinating no."+j);
            }
            
        }
    }
}