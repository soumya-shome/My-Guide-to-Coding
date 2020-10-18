import java.util.Scanner;
class C2K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature (in Celcius) : ");
        double c=sc.nextDouble();
        sc.close();
        double k=c+273.15;
        System.out.print("Temperature in Kelvin : "+k);
    }
}