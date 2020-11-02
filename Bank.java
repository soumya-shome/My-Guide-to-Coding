import java.util.*;
class Bank
{
    int balance;
    String Name;
    String Type;
    int acno;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        Name=sc.next();
        System.out.println("Enter Account number");
        acno=sc.nextInt();
        System.out.println("Enter Type of Acoount");
        Type = sc.next();
        System.out.println("Enter Balance");
        balance=sc.nextInt();
    }

    void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited");
        int d=sc.nextInt();
        balance+=d;
    }

    void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn");
        int w=sc.nextInt();
        if(balance<w)
        {
            System.out.println("Withdraw not possible ,low balance");
        }
        else
        {
            System.out.println("Balance="+balance);
            balance-=w;
        }
    }

    void display()
    {
        System.out.println("Name :-  "+Name);
        System.out.println("Account number :-  "+acno);
        System.out.println("Account Type :-  "+Type);
        System.out.println("Balance :-  "+balance);
    }

    static void main()
    {
        Scanner sc=new Scanner(System.in);
        Bank ob=new Bank();
        ob.input();
        System.out.println("Enter your choice"+'\n'+"1.Deposit"+'\n'+"2.Withdraw");
        int n =sc.nextInt();
        switch(n)
        {
            case 1:
            ob.deposit();
            break;

            case 2:
            ob.withdraw();
            break;

            default:
            System.out.println("Wrong Input");
        }
        ob.display();
    }
}
