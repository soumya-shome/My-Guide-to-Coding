import java.util.*;
class BinrySearch
{
    public static void meth()
    {
        int year[]={1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to be searched");
        int n=sc.nextInt();
        int l=0,u=9,m=0;
        int pos=0;
        while(l<=u)
        {
            m=(l+u)/2;
            if(n>year[m])
            {
                l=m+1;
            }
            else if(n<year[m])
            {
                u=m-1;
            }
            else if (n==year[m])
            {
                pos=m;
                break;
            }
        }
        if(pos>0)
        {
            System.out.println("Record found");
        }
        else 
        {
            System.out.println("Record not found");
        }
    }
}