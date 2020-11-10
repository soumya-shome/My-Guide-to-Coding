import java.util.*;
class Calendar
{
    static void meth()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Year");
        int y=sc.nextInt();
        System.out.println("Enter The Month in number");
        int m=sc.nextInt();
        String mo="";
        switch(m)
        {
            case 1:
            mo="January";
            break;

            case 2:
            mo="January";
            break;

            case 3:
            mo="January";
            break;

            case 4:
            mo="January";
            break;

            case 5:
            mo="January";
            break;

            case 6:
            mo="January";
            break;

            case 7:
            mo="January";
            break;

            case 8:
            mo="January";
            break;

            case 9:
            mo="January";
            break;

            case 10:
            mo="January";
            break;

            case 11:
            mo="January";
            break;

            case 12:
            mo="January";
            break;
        }
        System.out.println("Enter the first day of "+mo);
        String d=sc.next();
        int t=0;
        if(d.equalsIgnoreCase("Sunday"))
        {
            t=1;
        }
        else if(d.equalsIgnoreCase("monday"))
        {
            t=2;
        }
        else if(d.equalsIgnoreCase("tuesday"))
        {
            t=3;
        }
        else if(d.equalsIgnoreCase("wednesday"))
        {
            t=4;
        }
        else if(d.equalsIgnoreCase("thursday"))
        {
            t=5;
        }
        else if(d.equalsIgnoreCase("friday"))
        {
            t=6;
        }
        else if(d.equalsIgnoreCase("saturday"))
        {
            t=7;
        }
        int day=0;
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 ||m==12)
        {
            day=31;
        }
        else if(m==4 || m==6 || m==9 || m==11)
        {
            day=30;
        }
        else
        {
            if(y%400==0 && y%4==0)
            {
                if(y%100!=0)
                {
                    day=29;
                }
            }
            else
            {
                day=28;
            }
        }
        System.out.println(t);
        System.out.println("S\tM\tT\tW\tTh\tF\tS");
        int a=1;
        for(int i=1;i<=6;i++)
        {
            if(a>day)
            {
                break;
            }
            for (int j=1;j<=7;j++)
            {
                if(i==1)
                {
                    if(j>=t)
                    {
                        System.out.print(a+"\t");
                        a++;
                    }
                    else
                    {
                        System.out.print(" \t");
                    }
                    //System.out.println();
                }
                else
                {
                    System.out.print(a+"\t");
                    a++;
                }
                if(a>day)
                {
                    break;
                }
            }
            System.out.println();
        }
    }
}