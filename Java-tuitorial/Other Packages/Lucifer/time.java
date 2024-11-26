import java.util.*;
class time
{
    public static void meth()
    {
        int a[]=new int [3];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a date in form dd.mm.yyy;");
        String dt1=sc.next();
        dt1=dt1.trim();
        dt1=dt1+".";
        int l1=dt1.length();
        String p="";
        int u=0;
        for(int i=0;i<l1;i++)
        {
            char c=dt1.charAt(i);
            if(c!='.')
            {
                p=p+c;
            }
            else
            {
                a[u]=Integer.parseInt(p);
                p="";
                u++;
            }
        }

        int b[]=new int[3];
        System.out.println("Enter another date in form dd.mm.yyy;");
        String dt2=sc.next();
        dt2=dt2.trim();
        dt2=dt2+".";
        int l2=dt2.length();
        String p2="";
        int u2=0;
        for(int i2=0;i2<l2;i2++)
        {
            char c2=dt2.charAt(i2);
            if(c2!='.')
            {
                p2=p2+c2;
            }
            else
            {
                b[u2]=Integer.parseInt(p2);
                p2="";
                u2++;
            }
        }
        int days=0;
        int q[]={31,31,28,31,30,31,30,31,31,30,31,30};
        if(a[2]>b[2])
        {
            int y=a[2];
            a[2]=b[2];
            b[2]=y;
            int y2=a[1];
            a[1]=b[1];
            b[1]=y2;
            int y3=a[0];
            a[0]=b[0];
            b[0]=y3;
        }
        if(b[0]>31 || b[1]>12 || a[0]>31 || a[1]>12)
        {
            System.out.println("Wrong Input");
        }
        else if(a[2]!=b[2])
        {
            int g=0;
            int y;
            for(int j=a[2]+1;j<b[2];j++)
            {
                if(j%100==0)
                {
                    if(j%400==0)
                    {
                        days=days+366;
                    }
                    else
                    {
                        days=days+365;
                    }
                }
                else
                {
                    if(j%4==0)
                    {
                        days=days+366;
                    }
                    else
                    {
                        days=days+365;
                    }
                }
            }
            System.out.println("1"+days);
            int o=a[1]%12;//the month
            int day3=q[o]-a[0];
            days=days+day3;//for the given month
            for(int k=a[1]+1;k<=12;k++)
            {
                int o2=k%12;
                days=days+q[o2];
            }
            if(a[2]%100==0 && a[1]>=2)
            {
                if(a[2]%4==0)
                {
                    days++;
                }
            }
            System.out.println("DAys ="+days);
        }
        else if(a[2]==b[2])
        {

            int day4=a[1]%12;
            int r=q[day4]-a[0];
            days=days+r;
            int da=a[1]+1;
            for(int i5=da;i5<b[1];i5++)
            {
                int o4=i5%12;
                days=days+q[o4];
                System.out.println(days);
            }
            days=days+b[0];
            System.out.println(days);
            if(a[2]%100==0 && a[1]>=2)
            {
                if(a[2]%4==0)
                {
                    days++;
                }
            }
            System.out.println("DAys ="+days);
        }

    }
}
