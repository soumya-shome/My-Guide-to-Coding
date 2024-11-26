import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String d=sc.nextLine();
        FlightManagementSystem fm=new FlightManagementSystem();
        ArrayList<Flight> list=fm.viewFlightsBySourceDestination(s, d);
        if(list.isEmpty())
        {
        	System.out.println("No flights available for the given source and destination");
        }
    }
}