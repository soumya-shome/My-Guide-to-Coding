import java.util.*;
import java.io.*;

public class Main {

   public static void main(String[] args) { 
   
	   //fill the code
	   RainfallReport r=new RainfallReport();
	   List<AnnualRainfall> annualRain=r.generateRainfallReport("AllCityMonthlyRainfall.txt");
	   List<AnnualRainfall> maximumRain=r.findMaximumRainfallCities();
	   
	   System.out.println("All cities");
	   for(AnnualRainfall annual : annualRain){
	       System.out.println("id: "+annual.getCityPincode()+
	       " name: "+annual.getCityName()+
	       " rain: "+annual.getAverageAnnualRainfall());
	   }
	   System.out.println("Cities with maximum rainfall");
	   for(AnnualRainfall annual:maximumRain){
	       System.out.println("id: "+annual.getCityPincode()+
	       " name: "+annual.getCityName()+
	       " rain: "+annual.getAverageAnnualRainfall());
	   }
   }
}
          