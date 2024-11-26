import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int flightid=sc.nextInt();
        sc.nextLine();
        String source=sc.nextLine();
        String destination=sc.nextLine();
        int seats=sc.nextInt();
        sc.nextLine();
        double fare=sc.nextDouble();
        Flight f=new Flight(flightid,source,destination,seats,fare);
        FlightManagementSystem fm=new FlightManagementSystem();
        if(fm.addFlight(f)==true)
            System.out.println("Flight details added successfully");
        else
            System.out.println("Addition not done");
    }
}