import java.util.*;
class Main
{
    boolean armstrong(int n)
    {   
        int n1=n;
        int r=0;
        while(n>0)
        {
            int t=n%10;
            r=r+t*t*t;
            n=n/10;
        }
        if(r==n1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void main()
    {
        for(int i=1;i<1000;i++)
        {
            boolean q=armstrong(i);
            if(q==true)
            {
                System.out.println(i);
            }
        }
    }
}