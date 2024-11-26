import java.util.*;
class swap
{
    public static void main()
    { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number");
        int b= sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("1st Number : "+a);
        System.out.println("2nd Number : "+b);
    }
}