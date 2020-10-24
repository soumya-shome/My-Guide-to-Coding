import java.util.Scanner;
class Go2N{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c=sc.nextInt();
        sc.close();
        if(a!=b && b!=c && a!=c){
            if(a>b && a>c){
               System.out.println(a+" is the Greatest Number ");
            }else if(b>a && b>c){
                System.out.println(b+" is the Greatest Number ");
            }else{
                System.out.println(c+" is the Greatest Number ");
            }
        }else{
            System.out.println("Try with 3 different Numbers");
        }
    }
}