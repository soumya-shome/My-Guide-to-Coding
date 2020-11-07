import java.util.*;
class OCMobike
{
    int bno;
    int phno;
    String name;
    int days;
    int charge;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bike no.");
        bno=sc.nextInt();
        System.out.println("Enter Phone no.");
        phno=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter no. of days");
        days=sc.nextInt();
    }

    void copmute()
    {
        if(days<=5)
        {
            charge=500;
        }
        else if(days>5 && days<=10)
        {
            charge=500+(days-5)*400;
        }
        else if(days>10)
        {
            charge=500+5*400+(days-10)*200;
        }
    }

    void display()
    {
        System.out.println("Bike no."+"\t"+"Ph.no."+"\t"+"Name"+"\t"+"Days"+"\t"+"Charges");
        System.out.println(bno+"\t"+phno+"\t"+name+"\t"+days+"\t"+charge);
    }

    public static void meth()
    {
        OCMobike ob=new OCMobike();
        ob.input();
        ob.copmute();
        ob.display();
    }
}