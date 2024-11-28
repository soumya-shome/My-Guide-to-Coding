import java.util.*;
import java.sql.*;

public class FlightManagementSystem{
	public ArrayList<Flight> viewFlightsBySourceDestination(String source,String destination){
		try {
			DB db=new DB();
			Connection con=db.getConnection();
			String query=("select * from flight where source=? and destination=?");
			ArrayList<Flight> list=new ArrayList<Flight>();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, source);
			ps.setString(2, destination);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				int seat=rs.getInt(4);
				double fare=rs.getDouble(5);
				Flight f=new Flight(id,source,destination,seat,fare);
				list.add(f);
			}
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return (new ArrayList<Flight>());
	}
}