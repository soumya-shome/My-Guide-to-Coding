import java.util.*;
class odd_even
{
    private int odd(int a)
    {
        if(a%2==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public static void main()
    {
        odd_even obj = new odd_even();
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int a = SC.nextInt();
        int c = obj.odd(a);
        if(c==1){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
}