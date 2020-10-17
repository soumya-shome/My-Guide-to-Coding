//Area of a Circle
import java.util.Scanner;
public class AoC{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r=sc.nextInt();
        sc.close();
        double area=Math.pow(r,2)*Math.PI;
        System.out.println("Area : "+area);
    }
}