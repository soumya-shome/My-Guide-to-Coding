//Perimeter of a Rectangle
import java.util.Scanner;
public class PoR{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length : ");
        int l=sc.nextInt();
        System.out.print("Enter Breadth : ");
        int b=sc.nextInt();
        sc.close();
        int peri=2*(l+b);
        System.out.println("Perimeter : "+peri);
    }
}