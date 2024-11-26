import java.util.*;
class dd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a1=sc.next().charAt(0);
        char a2=sc.next().charAt(0);
        String s2=s.replace(a1,a2);
        System.out.println(s2);
    }
}