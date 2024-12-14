class Tourist
{
    private String touristid;
    private String touristName;
    private String destination;
    private int daysOfTravel;
    private double travelCost;

    public Tourist(String touristid,String touristName,String destination,int daysOfTravel){
        this.touristid=touristid;
        this.touristName=touristName;
        this.destination=destination;
        this.daysOfTravel=daysOfTravel;
    }

    public void setTouristId(String touristid){
        this.touristid=touristid;
    }
    public String getTouristId(){
        return touristid;
    }

    public void setTouristName(String touristName){
        this.touristName=touristName;
    }
    public String getTouristName(){
        return touristName;
    }

    public void setDestination(String destination){
        this.destination=destination;
    }
    public String getDestination(){
        return destination;
    }

    public void setDaysOfTravel(int daysOfTravel){
        this.daysOfTravel=daysOfTravel;
    }
    public int getDaysOfTravel(){
        return daysOfTravel;
    }

    public void setTravelCost(double travelCost){
        this.travelCost=travelCost;
    }
    public double getTravelCost(){
        return travelCost;
    }
}