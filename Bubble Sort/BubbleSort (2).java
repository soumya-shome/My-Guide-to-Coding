import java.util.*;
class BubbleSort
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
        for(int j=0;j<9;j++)
        {
            for(int k=0;k<(9-j);k++)
            {
                if(a[k]>a[k+1])
                {
                    int t=a[k];
                    a[k]=a[k+1];
                    a[k+1]=t;
                }
            }
            
        }
        System.out.println("------------------");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
