//Perimeter of a Square
import java.util.Scanner;
public class PoS{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Side : ");
        int s=sc.nextInt();
        sc.close();
        int peri=4*s;
        System.out.println("Perimeter : "+peri);
    }
}