import java.util.*;
public class p2
{
    public void specialwodigit(int n)
    {
        int a=n%10;
        int b=n/10;
        int sum1=a+b;
        int sum2=a*b;
        if(sum1==sum2){
            System.out.println("Special number");
        }else{
            System.out.println("Not a special number");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        p2 ob=new p2();
        System.out.println("Enter base and height for parallelogram : ");
        int n=sc.nextInt();
        ob.specialwodigit(n);
    }
}