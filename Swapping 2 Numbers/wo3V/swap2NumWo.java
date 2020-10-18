import java.util.Scanner;
public class swap2NumWo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b=sc.nextInt();
        sc.close();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("1st number : "+a);
        System.out.println("2nd number : "+b);
    }
}