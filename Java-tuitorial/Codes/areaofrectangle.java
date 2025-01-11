import java.util.*;
public class Main
{
    public int area(int a,int b)
    {
        return a*b;
    }
    public static void main()
    {
        areaofrectangle obj = new areaofrectangle();
        Scanner SC = new Scanner(System.in);
        System.out.println("enter length");
        int a = SC.nextInt();
        System.out.println("enter breadth");
        int b = SC.nextInt();
        int c = obj.area(a,b);
        System.out.println(c);
    }
}