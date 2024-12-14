public class Cube1{
    float cube(float a){
        float n=a*a*a;
        return n;
    }
    
    public static void main(){
        float x=7.5f,y=0;
        Cube1 ob=new Cube1();
        y=ob.cube(x);
        System.out.println("Cube of "+x+": "+y);
    }
}