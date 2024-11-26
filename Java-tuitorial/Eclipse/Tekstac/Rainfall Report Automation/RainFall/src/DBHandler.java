import java.sql.Connection;
import java.sql.*;
import java.util.*;
import java.io.*;

public class DBHandler {
    
	//Write the required business logic as expected in the question description
	    
	private static Connection con=null;
	private static Properties props=new Properties();
	
	public Connection establishConnection() throws ClassNotFoundException, SQLException
	{

		//fill the code
		try{
		    FileInputStream fis=null;
		    fis=new FileInputStream("db.properties");
		    props.load(fis);
		    Class.forName(props.getProperty("db.classname"));
		    con=DriverManager.getConnection(props.getProperty("db.url"),props.getProperty("db.username"),props.getProperty("db.password"));
		}catch (IOException e){
		    e.printStackTrace();
		}
		return con;

	}
}
