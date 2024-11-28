public class Road{
    public void ride(Vechile v){
        
        /*
        //Upcasting
        if(v instanceof Car){
            System.out.println("Car Object in ride");
        }
        else if(v instanceof Truck){
            System.out.println("Truck Object in ride");
        }*/
        //Downcasting
        if(v instanceof Car){
            Car c=(Car)v;
            System.out.println("No Of Seats"+c.getNoOfSeats());
        }
        else if(v instanceof Truck){
            Truck t=(Truck)v;
            System.out.println("Max Load"+t.getLoad());
        }
        else{
            System.out.println("Vechile Object in ride");
        }
    }
}