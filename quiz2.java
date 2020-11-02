import java.util.*;
class quiz
{
    int score;
    quiz()
    {
        score=0;
    }
    
    public void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tWELCOME TO KBC!");
        System.out.println("Enter your name:-");
        String s=sc.nextLine();
        System.out.println("We welcome "+s+" to the show");
        System.out.println("There will be four rounds. \n1.Movie \n2.Sports \n3.G.K. \n4.Computer");
        System.out.println("Enter 1. to play");
        int p=sc.nextInt();
        if(p==1)
        {
            ques();
        }
        else
        {
            System.out.println("Please Enter 1 to play");
            int p2=sc.nextInt();
            if(p2==1)
            {
                ques();
            }
        }
    }
    
    void ques()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(\u000C);
        System.out.println("Round 1. Movies");
        System.out.println("1.Name a Movie on a ship");
        System.out.print("Answer:- ");
        String ans1=sc.nextLine();
        if(ans1.equalsIgnoreCase("Titanic"))
        {
            System.out.println("Correct Answer");
            score=score+10;
        }
        else
        {
            System.out.println("Wrong Answer");
            System.out.println("The Correct Answer is :- Titanic");
        }
        System.out.println("2.Name a Movie on a wizard");
        System.out.print("Answer:- ");
        String ans2=sc.nextLine();
        if(ans2.equalsIgnoreCase("Harry Potter"))
        {
            System.out.println("Correct Answer");
            score=score+10;
        }
        else
        {
            System.out.println("Wrong Answer");
            System.out.println("The Correct Answer is :- Harry Potter");
        }
        System.out.println("Your Current Score is "+score);
        
        System.out.println();
        
        
        System.out.println("Round 2. Sports");
        System.out.println("1.Name the player who played 200 test match");
        System.out.print("Answer(First name accepted):- ");
        String ans3=sc.nextLine();
        if(ans3.equalsIgnoreCase("Sachin") || ans3.equalsIgnoreCase("Sachin tendulkar"))
        {
            System.out.println("Correct Answer");
            score=score+20;
        }
        else
        {
            System.out.println("Wrong Answer");
            System.out.println("The Correct Answer is :- Sachin Tendulkar");
        }
        System.out.println("2.Name the current Indian Test Captain");
        System.out.print("Answer(First name accepted):- ");
        String ans4=sc.nextLine();
        if(ans4.equalsIgnoreCase("Virat")||ans4.equalsIgnoreCase("Virat Kohli"))
        {
            System.out.println("Correct Answer");
            score=score+20;
        }
        else
        {
            System.out.println("Wrong Answer");
            System.out.println("The Correct Answer is :- Virat Kohli");
        }
        System.out.println("Your Current Score is "+score);
        System.out.println();
        System.out.println("Round 3. GK");
        System.out.println("1.Name India's First President");
        System.out.print("Answer(First name accepted):- ");
        String ans5=sc.nextLine();
        if(ans5.equalsIgnoreCase("Rajendra") || ans5.equalsIgnoreCase("Rajendra Prasad"))
        {
            System.out.println("Correct Answer");
            score=score+20;
        }
        else
        {
            System.out.println("Wrong Answer");
            System.out.println("The Correct Answer is :- Rajendra Prasad");
        }
        System.out.println("2.Name India's Capital");
        System.out.print("Answer:- ");
        String ans6=sc.nextLine();
        if(ans6.equalsIgnoreCase("New DelhI")||ans6.equalsIgnoreCase("Virat Kohli"))
        {
            System.out.println("Correct Answer");
            score=score+20;
        }
        else
        {
            System.out.println("Wrong Answer");
            System.out.println("The Correct Answer is :- Virat Kohli");
        }
        System.out.println("Your Current Score is "+score);
        System.out.println();
        System.out.println("Round 4. Computer");
        System.out.println("1.RAM - FULL FORM");
        System.out.print("Answer:- ");
        String ans7=sc.nextLine();
        if(ans7.equalsIgnoreCase("RANDOM ACCESS MEMORY") || ans7.equalsIgnoreCase("RANDOM ACCESS MEMORY"))
        {
            System.out.println("Correct Answer");
            score=score+20;
        }
        else
        {
            System.out.println("Wrong Answer");
            System.out.println("The Correct Answer is :- RANDOM ACCESS MEMORY");
        }
        System.out.println("CPU - FULL FORM");
        System.out.print("Answer:- ");
        String ans8=sc.nextLine();
        if(ans8.equalsIgnoreCase("CENTRAL PROCESSING UNIT")||ans8.equalsIgnoreCase("CENTRAL PROCESSING UNIT"))
        {
            System.out.println("Correct Answer");
            score=score+20;
        }
        else
        {
            System.out.println("Wrong Answer");
            System.out.println("The Correct Answer is :- CENTRAL PROCESSING UNIT");
        }
        System.out.println("Your Current Score is "+score);
    }
}
