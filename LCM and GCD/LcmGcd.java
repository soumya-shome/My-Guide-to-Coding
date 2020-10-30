import java.util.Scanner;
class LcmGcd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2=sc.nextInt();
        sc.close();
        int num=n2,den=n1;
        int rem=num%den;
        while (rem != 0){
            num   = den;
            den = rem;
            rem   = num % den;
        }
        int gcd = den;
        int lcm = n1 * n2 / gcd;
        System.out.println("GCD of "+n1+" and  "+n2+" : "+gcd);
        System.out.println("LCM of "+n1+" and  "+n2+" : "+lcm);
    }
}