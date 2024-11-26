import java.sql.*;
public class FlightManagementSystem{
    public Flight viewFlightById(int flightId){
        try{
            DB db=new DB();
            Connection con=db.getConnection();
            String query=("select * from flight where flightId=?");
            PreparedStatement  ps=con.prepareStatement(query);
            ps.setInt(1, flightId);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
            	int id=rs.getInt(1);
            	String s=rs.getString(2);
            	String d=rs.getString(3);
            	int seat=rs.getInt(4);
            	double fare=rs.getInt(5);
            	Flight f=new Flight(id,s,d,seat,fare);
            	return f;
            }
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
}