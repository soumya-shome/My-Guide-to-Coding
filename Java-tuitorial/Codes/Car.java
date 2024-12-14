public class Car extends Vechile{
    private int noOfSeats=1;

    public Car(int power, int noOfSeats){
        super(power);
        this.noOfSeats=noOfSeats;
    }

    public int getNoOfSeats(){
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats=noOfSeats;
    }

    public void display(){
        System.out.println("Car Object");
    }
}
