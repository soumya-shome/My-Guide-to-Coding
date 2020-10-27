import java.util.Scanner;
class SoD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        sc.close();
        int s=0;
        while(n!=0){
            int t=n%10;
            s=s+t;
            n=n/10;
        }
        System.out.print("Sum of Digits : "+s);
    }
}