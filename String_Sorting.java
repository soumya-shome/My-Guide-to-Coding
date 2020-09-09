import java.util.*;
class String_Sorting
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[10];
        System.out.println("Enter 10 names");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextLine();
        }
        int min;
        for(int j=0;j<9;j++)
        {
            min=j;
            for(int k=j+1;k<10;k++)
            {
                int n=a[k].compareTo(a[min]);
                if(n>0)
                {
                    min=k;
                    String t=a[j];
                    a[j]=a[min];
                    a[min]=t;
                }
            }
        }
        System.out.println("The Sorted Array is");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}