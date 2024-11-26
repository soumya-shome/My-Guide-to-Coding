import java.util.*;
class five
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter Choice");
        int ch=sc.nextInt();
        int s;
        switch(ch)
        {
            case 1:
                s=a+b;
                System.out.println(s);
            break;

            case 2:
                s=a-b;
                System.out.println(s);
            break;

            case 3:
                s=a*b;
                System.out.println(s);
            break;

            case 4:
                s=a/b;
                System.out.println(s);
            break;

            default:
                System.out.println("Wrong Input");
            break;
        }
    }
}