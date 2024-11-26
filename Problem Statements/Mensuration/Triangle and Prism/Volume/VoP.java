import java.util.Scanner;
public class AoT {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Side : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Side : ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd Side : ");
        int c=sc.nextInt();
        System.out.print("Enter Height : ");
        int h=sc.nextInt();
        sc.close();
        double s=(a+b+c)/2;
        double t=((s*(s-a))*(s-b))*(s-c);
        double vol=h*Math.sqrt(t);
        System.out.print("Volume : "+vol);
    }    
}
