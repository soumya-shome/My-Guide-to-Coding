import java.util.*;
public class cube
{
    public int vc(int s){
        int c=(int)Math.pow(s,3);
        return c;
    }
    
    public int vs(int r)
    {
        double i=(4/3)*3.14*Math.pow(r,3);
        return (int)i;
    }
    
    public int vcd(int l,int b,int h)
    {
        int f=l*b*h;
        return f;
    }
    
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int volume=0;
        int c=sc.nextInt();
        cube ob=new cube();
        switch(c){
            case 1:
                System.out.println("Enter side : ");
                int s=sc.nextInt();
                volume=ob.vc(s);
            break;
            
            case 2:
                System.out.println("Enter radius : ");
                int r=sc.nextInt();
                volume=ob.vc(r);
            break;
            
            case 3:
                System.out.println("Enter length : ");
                int l=sc.nextInt();
                System.out.println("Enter breadth : ");
                int b=sc.nextInt();
                System.out.println("Enter height : ");
                int h=sc.nextInt();
                volume=ob.vcd(l,b,h);
            break;
        }
        System.out.println("Volume : "+volume);
    }
}