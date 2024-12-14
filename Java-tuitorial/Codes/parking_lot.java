import java.util.*; 
class parking_lot
{
    int vno;
    int hrs;
    double bill;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vechile number : ");
        vno=sc.nextInt();
        System.out.println("Enter hours");
        hrs=sc.nextInt();
    }

    void calculate()
    {
        if(hrs<=1)
        {
            bill =hrs*3;
        }
        else if(hrs>1)
        {
            bill = 1*3+(hrs-1)*1.5;
        }
    }

    void display()
    {
        System.out.println("vechile number: "+vno);
        System.out.println("hours: "+hrs);
        System.out.println("bill: "+bill);
    }

    public static void main()
    {
        parking_lot obj= new parking_lot();
        obj.input();
        obj.calculate();
        obj.display();
        
        parking_lot ob= new parking_lot();
        ob.input();
        ob.calculate();
        ob.display();
    }
}