
//Circumference of a Circle
import java.util.Scanner;
public class CoC{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r=sc.nextInt();
        sc.close();
        double circum=2*Math.PI*r;
        System.out.println("Circumference : "+circum);
    }
}