public class Tourist {
   private String touristId;
   private String touristName;
   private String destination;
   private int daysOfTravel;
   private double travelCost;
   
   public Tourist(String ti,String tn,String des,int dot)
   {
       touristId=ti;
       touristName=tn;
       destination=des;
       daysOfTravel=dot;
       //travelCost=cost;
   }
   
   public void setTouristId(String tid)
   {
       touristId=tid;
   }
   public String getTouristId()
   {
       return touristId;
   }
   public void setTouristName(String tn)
   {
       touristName=tn;
   }
   public String getTouristName()
   {
       return touristName;
   }
   public void setDestianation(String d)
   {
       destination=d;
   }
   public String getDestination()
   {
       return destination;
   }
   public void setDaysOfTravel(int dot)
   {
       daysOfTravel=dot;
   }
   public int getDaysOfTravel()
   {
       return daysOfTravel;
   }
   public void setTravelCost(double c)
   {
       travelCost=c;
   }
   public double getTravelCost()
   {
       return travelCost;
   }
}