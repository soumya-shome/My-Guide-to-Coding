import java.util.*;
class six
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int b=0;
        while(n!=0)
        {
            int d=n%10;
            if(d==0){
                b++;
            }
            n=n/10;
        }
        if(b>0){
            System.out.println("It is a Nest Number");
        }
        else
        {
            System.out.println("Not a Nest Number");
        }
        
    }
}