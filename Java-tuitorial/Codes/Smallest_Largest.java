import java.util.Scanner;
public class Smallest_Largest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,m,min,max;
        System.out.println("Enter 1st number: ");
        m=sc.nextInt();
        max=m;
        min=m;
        System.out.println("Enter rest 9 numbers");
        for(i=1;i<=9;++i)
        {
            m=sc.nextInt();
            if(max<m)
            {
                max=m;
            }
            if(min>m){
                min=m;
            }
        }
        System.out.println("Max number : "+max);
        System.out.println("Min number : "+min);
    }
}