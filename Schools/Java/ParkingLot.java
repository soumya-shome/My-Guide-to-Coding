import java.util.*;

public class ParkingLot{
    public int vno, hours;
    public double bill;

    public ParkingLot(){
        this.vno = 0;
        this.hours = 0;
        this.bill = 0.0;
    }

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the vehicle number: ");
        this.vno = sc.nextInt();
        System.out.print("Enter the number of hours: ");
        this.hours = sc.nextInt();
    }

    public void calculate(){
        if (this.vno <=0){
            this.bill = 3.0;
        }else{
            this.bill = 3.0 + (this.hours-1)*1.5;
        }
    }

    public void display(){
        System.out.println("Vechile number : "+this.vno);
        System.out.println("Hours Parked : "+this.hours+" hrs");
        System.out.println("Total Bill : Rs "+this.bill);
    }

    public static void main(String args[]){
        ParkingLot ob = new ParkingLot();
        ob.input();
        ob.calculate();
        ob.display();
    }
}