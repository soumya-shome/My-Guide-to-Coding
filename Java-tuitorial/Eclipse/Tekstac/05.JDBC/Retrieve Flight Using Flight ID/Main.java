import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int search=sc.nextInt();
        FlightManagementSystem fm=new FlightManagementSystem();
        if(fm.viewFlightById(search)!=null) {
        	Flight f=fm.viewFlightById(search);
        	System.out.println("Flight ID : "+search);
        	System.out.println("Source : "+f.getSource());
        	System.out.println("Destination : "+f.getDestination());
        	System.out.println("No of seats : "+f.getNoOfSeats());
        	System.out.println("Flight Fare : "+f.getFlightFare());
        }
        else
        	System.out.println("Invalid Flight ID");
        
    }
}