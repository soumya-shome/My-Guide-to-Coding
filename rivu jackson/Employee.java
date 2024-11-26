import java.util.*;
class Employee
{
    int salary;
    String name;
    double netSalary;
    int incometax;
    double tax;
    
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter salary:");
        salary=sc.nextInt();
    }
    
    public void compute(){
    
    }
    
    public void display(){
    
    }
    
    public static void main(){
        
    }
}
