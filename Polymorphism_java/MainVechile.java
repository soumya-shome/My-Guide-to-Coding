public class MainVechile{
    public static void main(String a[]){
        Vechile v1=new Vechile(100);
        Vechile v2=new Car(100,5);
        Vechile v3=new Truck(200,1000);

        v1.display();
        v2.display();
        v3.display();
        System.out.println();
        Road r=new Road();
        r.ride(v1);
        r.ride(v2);
        r.ride(v3);
    }
}
