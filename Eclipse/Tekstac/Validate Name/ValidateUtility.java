import java.util.Scanner;
public class ValidateUtility implements Validate
{
    public static void main(String args[])
    {
        //fill code here
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String product=sc.nextLine();
        ValidateUtility obj=new ValidateUtility();
        if(obj.validateName(name))
        System.out.println("Employee name is valid");
        else 
        System.out.println("Employee name is invalid");
        if(obj.validateName(product))
        System.out.println("Product name is valid");
        else
        System.out.println("Product name is invalid");
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        Validate v=(str)->{
            if(str.matches("[a-zA-Z\\s]{5,20}"))
            return true;
            else
            return false;
            
        };
        return v;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        Validate v=(str)->{
          if(str.matches("[a-zA-Z]{1}[\\d]{5}"))
            return true;
        else
            return false;
        };
        return v;
        
    }
    public boolean validateName(String name){
       if(name.matches("[a-zA-Z\\s]{5,20}")||name.matches("[a-zA-Z]{1}[\\d]{5}"))
       return true;
       else
       return false;
    }
}