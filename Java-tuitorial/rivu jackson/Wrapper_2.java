import java.util.*;
class Wrapper_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char a=sc.next().charAt(0);
        if(Character.isLetter(a)){
            System.out.println("It is a Letter");
        }
        else if(Character.isDigit(a)){
            System.out.println("It is a Digit");
        }
        else{
            System.out.println("Neither a Letter nor a Digit");
        }
    }
}