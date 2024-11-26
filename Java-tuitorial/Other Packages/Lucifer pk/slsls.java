//decimal to binary
import java.util.*;
class slsls
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        char c[]={'0','1'};
        String dec="";
        int n1=n;
        int a=0;
        while(n1!=0)
        {

            a=n1%2;
            dec=c[a]+dec;
            n1=n1/2;
        }
        System.out.println(dec);
    }
}