import java.util.*;
class quiz
{
    int score;
    quiz()
    {
        score=0;
    }
    
    void clears()
    {
        System.out.println("\u000c");
    }
    
    void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tKBC");
        System.out.println("Welcome to KBC");
        System.out.println("Enter Your Name");
        String s=sc.next();
        System.out.println("We welcome "+s+" to the show");
        System.out.println("Enter 1 to play");
        String st=sc.next();
        if(st=="1")
        {
            play();
        }
    }
    
    void play()
    {
        clears();
        System.out.println("Round 1");
        
        
    }
    
    void result()
    {
        System.out.println("Your Final Score is "+score);
        if(score<=40 && score>10)
        {
            System.out.println("You Won:- A Rs100 Voucher");
        }
        else if(score<=60 && score>10)
        {
            System.out.println("You Won:- A Rs100 Voucher and a Dinner");
        }
        else if(score<=200 && score>10)
        {
            System.out.println("You Won:- A Rs100 Voucher, a Dinner and a tour to Goa");
        }
    }
    
    static void meth()
    {
        quiz obj=new quiz();
        obj.clears();
        obj.display();
        obj.play();
        obj.clears();
        obj.result();
    }
}
