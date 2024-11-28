import java.util.*;
public class Division{
    //Scanner sc=new Scanner(System.in);
    public String divideTwoNumbers(int number1,int number2){
        String str="";
        try{
            int div=number1/number2;
            str="The answer is "+div;
        }
        catch(ArithmeticException e){
            str="Division by zero is not possible";
            
        }
        finally{
            return str+". Thanks for using the application.";
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Division d=new Division();
        System.out.println(d.divideTwoNumbers(n1,n2));
    }
}