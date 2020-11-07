//arrange city name in ascending order using compareto
import java.util.*;
class t2
{
    public static void meth ()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        String ct[]=new String[24];
        String t=" ";
        for(i=0;i<24;i++)
        {
            System.out.println("Enter cityname in cell");
            ct[i]=sc.nextLine();
        }
        for(i=0;i<9;i++)
        {
            for(j=i+1;j<24;j++)
            {
                if(ct[i].compareTo(ct[j])>0)
                {
                    t=ct[i];
                    ct[i]=ct[j];
                    ct[j]=t;
                }
            }
        }
        System.out.println("The city names arrangd in ascending order as ");
        for(j=0;j<24;j++)
        {
            System.out.println((j+1)+ct[j]);
        }
    }
}