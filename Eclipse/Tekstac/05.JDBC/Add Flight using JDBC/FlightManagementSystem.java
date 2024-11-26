import java.sql.*;
public class FlightManagementSystem{
    public boolean addFlight(Flight flightObj){
        try{
            DB db=new DB();
            Connection con=db.getConnection();
            int id=flightObj.getFlightId();
            String s=flightObj.getSource();
            String d=flightObj.getDestination();
            int seats=flightObj.getNoOfSeats();
            double fare=flightObj.getFlightFare();
            String query=("insert into flight(flightid,source,destination,noOfSeats,flightfare) values(?,?,?,?,?)");
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,id);
            ps.setString(2,s);
            ps.setString(3,d);
            ps.setInt(4,seats);
            ps.setDouble(5,fare);
            int c=ps.executeUpdate();
            if(c==1)
                return true;
            else 
                return false;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}