import java.util.*;
class weird_no
{
    public static void main()
    { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if (n%2!=0)
        {
            System.out.println("Weird");
        }
        else{
            if (n>=2 && n<=5)
            {
                System.out.println("Not weird");
            }
            else if (n>=6 && n<=20)
            {
                System.out.println("Weird");
            }
            else if (n>20)
            {
                System.out.println("not weird");
            }
        }
    }
}