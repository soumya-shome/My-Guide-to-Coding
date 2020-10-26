import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int x=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int y=sc.nextInt();
        System.out.print("Enter operation [ + , - , * , / ] : ");
        char s=sc.next();
        sc.close();
        double res;
        switch(s){
            case '+':
                res=x+y;
                System.out.print("Summation : "+res);
            break;
        
            case '-':
                res=x-y;
                System.out.print("Difference : "+res);
            break;
            
            case '*':
                res=x*y;
                System.out.print("Product : "+res);
            break;
            
            case '/':
                res=x/y;
                System.out.print("Division : "+res);
            break;
            
            default:
                System.out.print("Wrong Input !!");
            break;
        }
    }
}