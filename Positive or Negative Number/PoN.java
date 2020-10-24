import java.security.spec.ECPublicKeySpec;
import java.util.Scanner;
class PoN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        sc.close();
        if(n>=0){
            System.out.println(n+" is a Positive Number");
        }else{
            System.out.println(n+" is a Negative Number");
        }
    }
}