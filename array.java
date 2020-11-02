import java.util.*;
class array
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no,");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int j=0;j<10;j++)
        {
            if(a[j]>max)
            {
                max=a[j];
            }
            if(a[j]<min)
            {
                min=a[j];
            }
        }
        System.out.print(max+" "+min);
    }
}