import java.util.*;
class Password
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Password");
        String s=sc.next();
        int l=s.length();
        int a=0,b=0,d=0;
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
                a++;
            if(Character.isLetter(c)==false && Character.isDigit(c)==false)
                if(c!=' ')
                    b++;
            if(c==' ')
                d++;
        }
        if(l>=5 && l<=10)
            if(a>0)
                if(b>0)

                    if(d==0)
                        System.out.println("true");
                    else

                        System.out.println("false");
                else
                    System.out.println("false");
            else
                System.out.println("false");
        else
            System.out.println("false");
    }
}
 