import java.util.Scanner;
class prog23{
    static void main(){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number = ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number = ");
        b=sc.nextInt();
        c=a%b;
        System.out.println("Remainder = "+c);
    }
}