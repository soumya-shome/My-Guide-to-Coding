import java.util.*;
class grade
{
    public static void main()
    {
        Scanner SC = new Scanner (System.in);
        System.out.println("enter the marks");
        int m = SC.nextInt();
        if(m>90)
        {
            System.out.println("A "+m);
        }
        else if(m>75 && m<=90)
        {
            System.out.println("B "+m);
        }
        else if(m>60 && m<=75)
        {
            System.out.println("C "+m);
        }
        else if(m>40 && m<=60)
        {
            System.out.println("D "+m);
        }
        else if(m<40)
        {
            System.out.println("F "+m);
        }
        else if(m>100 && m<0)
        {
            System.out.println("wrong input");
        }
    }
}
            
            
