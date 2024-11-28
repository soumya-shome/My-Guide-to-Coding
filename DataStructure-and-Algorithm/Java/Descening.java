import java.util.*;
class Descening{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no,");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int min;
        for(int j=0;j<9;j++)
        {
            min=j;
            for(int k=j+1;k<10;k++)
            {
                if(a[k]>a[min])
                {
                    min=k;
                }
            }
            int t=a[j];
            a[j]=a[min];
            a[min]=t;
        }
        System.out.println("___________");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}