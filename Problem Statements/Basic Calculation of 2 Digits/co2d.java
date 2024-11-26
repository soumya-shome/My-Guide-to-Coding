
//Basic Calculaton  of 2 Digits
import java.util.Scanner;
class so2d{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2=sc.nextInt();
        sc.close();
        int sum=n1+n2;
        int diff=n1-n2;
        int quo=n1/n2;
        int pro=n1*n2;
        int rem=n1%n2;
        System.out.print("Summation : "+sum);
        System.out.print("Difference : "+diff);
        System.out.print("Product : "+pro);
        System.out.print("Quotient : "+quo);
        System.out.print("Reminder : "+rem);

    }
}