import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        sc.nextLine();
        double fare=sc.nextDouble();
        FlightManagementSystem fm=new FlightManagementSystem();
        if(fm.updateFlightFare(id, fare))
        	System.out.println("Flight Fare updated successfully");
        else
        	System.out.println("Flight Fare not updated. Check for the ID");
    }
}