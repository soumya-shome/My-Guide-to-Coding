//Volume of a Sphere
import java.util.Scanner;
public class VoC{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Side : ");
        int s=sc.nextInt();
        sc.close();
        int vol=pow(s,3);
        System.out.println("Volume : "+vol);
    }
}