import java.util.*;
class print_string
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char a=sc.next().charAt(0);
        char b=a;
        if(Character.isLowerCase(a)){
            //System.out.println(Character.toUpperCase(a));
            b=Character.toUpperCase(a);
        }
        else if(Character.isUpperCase(a)){
            //System.out.println(Character.toLowerCase(a));
            b=Character.toLowerCase(a);
        }
        System.out.println(b);
    }
}