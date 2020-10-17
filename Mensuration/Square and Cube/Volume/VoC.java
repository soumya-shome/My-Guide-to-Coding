//Volume of a Sphere
import java.util.Scanner;
public class VoC{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r=sc.nextInt();
        sc.close();
        double vol=(4/3)*Math.PI*Math.pow(r,3);
        System.out.println("circumference : "+vol);
    }
}