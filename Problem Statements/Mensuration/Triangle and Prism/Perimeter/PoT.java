import java.util.Scanner;
class PoT{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Side : ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Side : ");
        int b=sc.nextInt();
        System.out.println("Enter 3rd Side : ");
        int c=sc.nextInt();
        sc.close();
        int peri=a+b+c;
        System.out.println("Perimeter : "+peri);
    }
}