import java.util.*;
class search_2
{
    int ola(int n)
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
    public  void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int m=sc.nextInt();
        int p=ola(m);
        System.out.println("No. found at "+p);
    }
}


    