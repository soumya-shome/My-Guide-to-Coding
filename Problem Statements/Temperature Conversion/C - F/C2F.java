import java.util.Scanner;
class C2F{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature (in Celcius) : ");
        double c=sc.nextDouble();
        sc.close();
        double f=((c/5.0)*9)+32.0;
        System.out.print("Temperature in Fahrenheit : "+f);
    }
}