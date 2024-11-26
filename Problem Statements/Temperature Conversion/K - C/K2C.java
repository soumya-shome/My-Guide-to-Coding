
import java.util.Scanner;
class K2C{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature (in Kelvin) : ");
        double k=sc.nextDouble();
        sc.close();
        double c=k-273.15;
        System.out.print("Temperature in Celcius : "+c);
    }
}