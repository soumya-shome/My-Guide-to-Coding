import java.util.*;
public class Calculator 
{
    public static Calculate performAddition(){
        Calculate c=(a,b)->a+b;
       return c;
    }
    public static Calculate performSubtraction(){
        Calculate c=(a,b)->{
            return a-b;
        };
        return c;
    }
    public static Calculate performProduct(){
        Calculate c=(a,b)->a*b;
        return c;
    }
    public static Calculate performDivision(){
        Calculate c=(a,b)->{
            if(b==0) return 0;
            return a/b;
        };
        return c;
    }
   /* public float performCalculation(int a,int b){
        float sum=a+b;
        float diff=a-b;
        float prod=a*b;
        float div=a/b;
        return sum;
    }*/
    public static void main (String[] args) {
        /* code */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Calculate add=performAddition();
        Calculate sub=performSubtraction();
        Calculate mul=performProduct();
        Calculate div=performDivision();
        //obj.performCalculation(a,b);
        System.out.println("The sum is "+add.performCalculation(a,b));
        System.out.println("The difference is "+sub.performCalculation(a,b));
        System.out.println("The product is "+mul.performCalculation(a,b));
        System.out.println("The division value is "+div.performCalculation(a,b));
    }
}