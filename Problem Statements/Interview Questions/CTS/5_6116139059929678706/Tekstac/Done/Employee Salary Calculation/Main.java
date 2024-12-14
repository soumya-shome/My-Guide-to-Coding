import java.util.Scanner;
public class Main extends Employee {
	public static Employee getEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter Id:");
		int eid=sc.nextInt();
		emp.setEmployeeId(eid);
		sc.nextLine();
		System.out.println("Enter Name:");
		String en=sc.nextLine();
		emp.setEmployeeName(en);
		System.out.println("Enter Salary:");
		double s=sc.nextDouble();
		emp.setSalary(s);
		
		return emp;
	}
	public static int getPFPercentage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PF percentage");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		Employee em=new Employee();
		em=getEmployeeDetails();
		em.calculateNetSalary(getPFPercentage());
		System.out.println("Id: "+em.getEmployeeId());
		System.out.println("Name: "+em.getEmployeeName());
		System.out.println("Salary: "+em.getSalary());
		System.out.println("Net Salary: "+em.getNetSalary());

	}

}