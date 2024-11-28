import java.util.*;
public class SUMof2
{
    public int sum(int a1,int b1)
    {
        return a1+b1;
    }
    
    public static void main()
    {
        SUMof2 obj = new SUMof2();
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int a = SC.nextInt();
        System.out.println("enter another number");
        int b = SC.nextInt();
        int c = obj.sum(a,b);
        System.out.println(c);
    }
}