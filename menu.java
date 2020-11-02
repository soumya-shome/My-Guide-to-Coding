import java.util.*;
class menu
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Package Delivey System");
        System.out.println("Enter the type of Package Delivery \n'O' for Ordinary \n'E' for Express");
        char c=sc.next().charAt(0);
        System.out.println("Enter the weight of the package");
        int w=sc.nextInt();
        int t,p=0;
        if(c=='o' || c=='O')
        {
            if(w<=100)
            {
                p=50;
            }
            else if(w>100 && w<=500)
            {
                w=w-100;
                t=w/100;
                p=50+(t*40);
            }
            else if(w>500)
            {
                w=w-600;
                t=w/100;
                p=50+500*40+(t*35);
            }
        }
        else if(c=='e' || c=='E')
        {
            if(w<=100)
            {
                p=80;
            }
            else if(w>100 && w<=500)
            {
                w=w-100;
                t=w/100;
                p=80+(t*70);
            }
            else if(w>500)
            {
                w=w-600;
                t=w/100;
                p=80+500*70+(t*65);
            }
        }
        if(p>0)
        {
            System.out.println("The total price is "+p);
        }
        else
        {
            System.out.println("Wrong Input");
        }
    }
}