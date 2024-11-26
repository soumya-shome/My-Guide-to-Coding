import java.util.Scanner;
public class swap2NumW{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b=sc.nextInt();
        sc.close();
        int c=a;
        a=b;
        b=c;
        System.out.println("1st number : "+a);
        System.out.println("2nd number : "+b);
    }
}