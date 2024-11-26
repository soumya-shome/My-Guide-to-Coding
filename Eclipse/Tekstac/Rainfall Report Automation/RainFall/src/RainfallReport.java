import java.util.*;
import java.sql.*;
import java.io.*;

public class RainfallReport {

	//Write the required business logic as expected in the question description
	public List<AnnualRainfall> generateRainfallReport(String filePath) {
	    
		//fill the code
		List<AnnualRainfall> listRain = new ArrayList<AnnualRainfall>();
		try{
		    String str;
		    BufferedReader br=new BufferedReader(new FileReader(filePath));
		    while((str=br.readLine())!=null){
		        String record[]=str.split(",");
		        String cityPincode=record[0];
		        String CityName=record[1];
		        double monthlyRainfall[]=new double[record.length-2];;
		        for(int i=2;i<record.length;i++){
		            monthlyRainfall[i]=Double.parseDouble(record[i]);
		        }
		        try{
		            if(validate(cityPincode)){
		                AnnualRainfall obj=new AnnualRainfall();
		                obj.setCityPincode(Integer.parseInt(cityPincode));
		                obj.setCityName(CityName);
		                obj.calculateAverageAnnualRainfall(monthlyRainfall);
		                listRain.add(obj);
		            }
		        }catch(InvalidCityPincodeException e){
		            System.out.println(e.getMessage());
		        }
		    }
		}catch(IOException e){
		    System.out.println(e.getMessage());
		}
		return listRain;
	}
	
	public List<AnnualRainfall>  findMaximumRainfallCities() {
	
		//fill the code
		List<AnnualRainfall> list1=new ArrayList<AnnualRainfall>();
		try{
		    DBHandler db=new DBHandler();
		    Connection con=db.establishConnection();
		    String st="select * from AnnualRainfall where average_annual_rainfall=(select max(average_annual_rainfall) from AnnualRainfall)";
		    PreparedStatement ps=con.PreparedStatement(st);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next()){
		        AnnualRainfall obj1=new AnnualRainfall();
		        obj1.setCityPincode(rs.getInt(1));
		        obj1.setCityName(rs.getString(2));
		        obj1.setAverageAnnualRainfall(rs.getDouble(3));
		        list1.add(obj1);
		    }
		}catch(Exception e){
		    e.printStackTrace();
		}
	return list1;
}
	
	
	public boolean validate(String cityPincode) throws InvalidCityPincodeException {
	
		//fill the code
    	if(cityPincode.length()==5){
    	    return true;
    	}else{
    	    throw new InvalidCityPincodeException("Invalid CityPincode");
    	}
	}

}
