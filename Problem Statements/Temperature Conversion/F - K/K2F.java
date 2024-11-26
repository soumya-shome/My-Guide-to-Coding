
import java.util.Scanner;
class K2F{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature (in Kelvin) : ");
        double k=sc.nextDouble();
        sc.close();
        double f=(k - 273.15) * 9/5 + 32;
        System.out.print("Temperature in Fahrenheit : "+f);
    }
}