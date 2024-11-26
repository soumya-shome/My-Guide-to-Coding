//decimal to binary
import java.util.*;
class sad
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        char c[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E'};
        String dec="";
        int n1=n;
        int a=0;
        while(n1!=0)
        {
            a=n1%16;
            if(a==0)
            {
                dec="0"+dec;
            }
            if(a==1)
            {
                dec="1"+dec;
            }
            if(a==2)
            {
                dec="2"+dec;
            }
            if(a==3)
            {
                dec="3"+dec;
            }
            if(a==4)
            {
                dec="4"+dec;
            }
            if(a==5)
            {
                dec="5"+dec;
            }
            if(a==6)
            {
                dec="6"+dec;
            }
            if(a==7)
            {
                dec="7"+dec;
            }
            if(a==8)
            {
                dec="8"+dec;
            }
            if(a==9)
            {
                dec="9"+dec;
            }
            if(a==10)
            {
                dec="A"+dec;
            }
            if(a==11)
            {
                dec="B"+dec;
            }
            if(a==12)
            {
                dec="C"+dec;
            }
            if(a==13)
            {
                dec="D"+dec;
            }
            if(a==14)
            {
                dec="E"+dec;
            }
            if(a==15)
            {
                dec="F"+dec;
            }
            n1=n1/16;
        }
        System.out.println(dec);
    }
}