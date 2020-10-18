
import java.util.Scanner;
class F2C{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature (in Fahrenheit) : ");
        double f=sc.nextDouble();
        sc.close();
        double c=(f-32)*5/9;
        System.out.print("Temperature in Celcius : "+c);
    }
}