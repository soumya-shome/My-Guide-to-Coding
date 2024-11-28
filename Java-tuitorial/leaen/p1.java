import java.util.*;
public class p1
{
    public void Areapg(int base,int ht)
    {
        int pg=base*ht;
        System.out.println("Area of parallelogram="+pg);
    }
    public void Arearh(int d1,int d2)
    {
        double rh=0.5*(double)d1*(double)d2;
        System.out.println("Area of rhombus="+rh);
    }
    public void Areatr(int a,int b,int h)
    {
        double tr=0.5*((double)a+(double)b)*(double)h;
        System.out.println("Area of trapezium="+tr);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        p1 ob=new p1();
        System.out.println("Enter base and height for parallelogram : ");
        int base=sc.nextInt();
        int height=sc.nextInt();
        ob.Areapg(base,height);
        System.out.println("Enter dialonals for rhombus : ");
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        ob.Arearh(d1,d2);
        System.out.println("Enter sides and distance for trapezium : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        ob.Areatr(a,b,h);
    }
}