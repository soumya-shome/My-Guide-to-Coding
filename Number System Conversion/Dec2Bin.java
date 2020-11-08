import java.util.*;
class Dec2Bin
{
    static void main()
    {
        Scanner sc=new Scanner (System.in);
        //System.out.println("Enter a number");
        //int n=sc.nextInt();
        String s;
        int n2;
        for(int n=0;n<=16;n++)
        {
            char b[]={'0','1'};
            s="";
            n2=n;
            while(n2!=0)
            {
                int t=n2%2;
                s=b[t]+s;
                n2=n2/2;
            }
            System.out.println("result of "+n+" =  "+s);
        }
    }
}

        