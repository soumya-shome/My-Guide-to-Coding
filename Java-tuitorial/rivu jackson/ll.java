public class ll
{
    int a;
    double b;
    /*
    public ll(){
        a=5;
        b=9.7;
    }
    */
   
    public ll(int a,double b){
        //this.a=a;
        
        this.b=b;
    }
    
   
   
    public void display(){
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
    
    public static void main(){
        //ll ob=new ll();
        ll ob=new ll(3,5.6);
        ob.display();
    }
    
}