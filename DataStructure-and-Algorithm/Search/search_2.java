import java.util.*;
class search_2
{
    static int ola(int n)
    {
        int a=56;
        int f=29;
        for(int i=1;;i++)
        {
            if(a<=98 )
            {
                if(f==n)
                {
                    return i;
                    
                }
            }
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int m=sc.nextInt();
        int p=ola(m);
        System.out.println("No. found at "+p);
    }
}


    