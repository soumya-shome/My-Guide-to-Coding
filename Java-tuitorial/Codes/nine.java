import java.util.*;
class nine
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days");
        int d=sc.nextInt();
        int f=0;
        if(d<=15 && d>10)
        {
            f=10;
        }
        else if(d>15 && d<=20)
        {
            f=15;
        }
        else if(d>20)
        {
            f=30;
        }
        System.out.println("Number of Days"+d);
        System.out.println("Fine"+f);
    }
}
