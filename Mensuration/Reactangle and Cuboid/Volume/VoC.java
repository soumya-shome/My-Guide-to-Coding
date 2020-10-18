//Volume of a Cuboid
import java.util.Scanner;
public class VoC{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length : ");
        int l=sc.nextInt();
        System.out.print("Enter Breadth : ");
        int b=sc.nextInt();
        System.out.print("Enter Height : ");
        int h=sc.nextInt();
        sc.close();
        int vol=l*b*h;
        System.out.println("Volume : "+vol);
    }
}
