import java.util.*;
class SelectionSort
{
    public static void meth()
    {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 no.s");
        for(int k=0;k<10;k++)
        {
            a[k]=sc.nextInt();
        }
        int small,pos;
        for(int i=0;i<10;i++)
        {
            small=a[i];
            pos=i;
            for(int j=i+1;j<10;j++)
            {
                if(a[j]<small)
                {
                    small=a[j];
                    pos=j;
                }
            }
            int t=a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
        System.out.println("**********");
        for(int l=0;l<10;l++)
        {
            System.out.print(a[l]+",");
        }
    }
}
