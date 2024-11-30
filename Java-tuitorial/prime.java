import java.util.*;
public class prime
{
    public int isPrime(int a)
    {
        int f=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                f++;
            }
        }
        if(f==2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public static void main()
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int a = SC.nextInt();
        prime obj = new prime();
        int m = obj.isPrime(a);
        if(m==1)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}