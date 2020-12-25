import java.util.Scanner;
class LcmGcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,lcm=1,gcd=1;
        System.out.print("Enter the 1st number : ");
        a=sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        b=sc.nextInt();
        sc.close();
        for(int i=1;i<a*b;i++){
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        lcm=(a*b)/gcd;
        System.out.println("L.C.M. = "+lcm);
        System.out.println("G.C.D. = "+gcd);
    }
}
