import java.util.*;
class bolod_18
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first side : ");
        int a= sc.nextInt();
        System.out.print("Enter the second number : ");
        int b= sc.nextInt();
        System.out.print("Enter the third number : ");
        int c= sc.nextInt();
        if ((a+b>c)&&(a+c>b)&&(b+c>a))
        {
            System.out.println("Triangle possible");
            if ((a==b)&&(b==c))
            {
                System.out.println("Equilateral triangle");
            }
            else if ((a==b)||(b==c)||(c==b))
            {
                System.out.println("Isosceles triangle");
            }
            else
            {
                System.out.println("Scalene triangle");
            }
        }
        else{
            System.out.println("Not Possible");
        }
    }
}