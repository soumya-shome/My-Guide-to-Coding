import java.sql.*;
public class FlightManagementSystem{
	public boolean updateFlightFare(int flightId,double flightFare) {
		try {
			Connection con=DB.getConnection();
			String query=("update flight set flightfare=? where flightId=?");
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(2, flightId);
			ps.setDouble(1, flightFare);
			int c=ps.executeUpdate();
			if(c==1) 
				return true;
			else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}