import java.util.*;
class AverageAndGreater
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[15];
        System.out.println("Enter no.s");
        int tot=0;
        for(int i=0;i<15;i++)
        {
            a[i]=sc.nextInt();
            tot=tot+a[i];
        }
        int avg=tot/15;
        System.out.println("Average="+avg);
        System.out.println("____________");
        System.out.println("Numbers greater than average ");
        for(int j=0;j<15;j++)
        {
            if(a[j]>avg)
            {
                System.out.println(a[j]);
            }
        }
    }
}
