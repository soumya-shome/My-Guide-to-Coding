import java.util.*;
public class Main{
    //Scanner sc=new Scanner(System.in);
    public static Candidate getCandidateDetails()throws InvalidSalaryException{
        Scanner sc=new Scanner(System.in);
        Candidate c=new Candidate();
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        c.setName(sc.nextLine());
        //sc.nextLine();
        System.out.println("Gender");
        c.setGender(sc.nextLine());
        System.out.println("Expected Salary");
        double sal=sc.nextDouble();
        if(sal<10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000");
        }
        c.setExpectedSalary(sal);
        return c;
    }
    public static void main (String[] args) {
        //Candidate c=Main.getCandidateDetails();
        try{
            Candidate c=Main.getCandidateDetails();
            if(c!=null)
                System.out.println("Registration Successfull");
            
        }
            catch(InvalidSalaryException e){
                System.out.println(e.getMessage());
            }
        }
    }