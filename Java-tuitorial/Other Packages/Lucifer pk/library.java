import java .util.Scanner;
class library
{
    String bn,an;
    int price,nd;
    double fine;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Book name");
        bn=sc.nextLine();
        System.out.println("Enter the authors name");
        an=sc.nextLine();
        System.out.println("Enter the Book price");
        price=sc.nextInt();
        System.out.println("Enter the no. of days book taken");
        nd=sc.nextInt();
    }


    void calculate()
    {
        if(nd>7&&nd<=14)
        {
            fine=1*(nd-7);
        }
        else if(nd>14 &&nd<=21)
        {
            fine=1*7+(nd-14)*1.50;
        }
        else if(nd>21&&nd<=28)
        {
            fine=1*7+1.50*7+(nd-21)*2;
        }
        else
        {
            fine=1*7+1.50*7+2*7+5*(nd-28);
        }
    }
    
    void display()
    {
        System.out.println("The book name is "+bn);
        System.out.println("The author of the book name is "+an);
        System.out.println("The price of the book is "+price);
        System.out.println("The no. of days the book is taken is "+nd);
        System.out.println("The fine is "+fine);
    }
    
    void main()
    {
        library obj=new library();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
        