
//Calculate Simple Interest 
import java.util.Scanner;
public class SI {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal : ");
        int prin=sc.nextInt();
        System.out.print("Enter Rate : ");
        int rate=sc.nextInt();
        System.out.print("Enter Time : ");
        int time=sc.nextInt();
        sc.close();
        double in=(prin*rate*time)/100;
        double amt=prin+in;
        System.out.println("Interest : "+in);
        System.out.print("Amount : "+amt);
    }
}
