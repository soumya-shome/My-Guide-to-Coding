
import java.util.Scanner;
class F2K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature (in Fahrenheit) : ");
        double f=sc.nextDouble();
        sc.close();
        double k=((f-32)*5/9)+273.15;
        System.out.print("Temperature in Kelvin : "+k);
    }
}