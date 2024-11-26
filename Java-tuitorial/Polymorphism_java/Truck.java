public class Truck extends Vechile {
    private float load;

    public Truck(int power,float load){
        super(power);
        this.load=load;
    }

    public float getLoad(){
        return load;
    }

    public void setLoad(float load){
        this.load=load;
    }

    public void display(){
        System.out.println("Truck Object");
    }
    
}
