//Area of a Square
import java.util.Scanner;
public class AoS{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Side : ");
        int s=sc.nextInt();
        sc.close();
        int area=Math.pow(s,2);
        System.out.println("Area : "+area);
    }
}
