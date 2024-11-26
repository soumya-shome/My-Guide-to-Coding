import java.util.*;
public class Main{
	public static void main() {
		Scanner sc=new Scanner(System.in);
		PermanentEmployee ob=new PermanentEmployee();
		System.out.println("Enter the name:");
		ob.setName(sc.next());
		System.out.print("Enter the salary:");
		ob.setSalary(sc.nextFloat());
		System.out.println("Enter the pfpercentage:");
		ob.setPfpercentage(sc.nextFloat());
		if(ob.validateInput()) {
			ob.findNetSalary();
			System.out.println("Employee Name:"+ob.getName());
			System.out.println("PF Amount:"+ob.getPfamount());
			System.out.println("Netsalary:"+ob.getNetsalary());
		}
		else {
			System.out.println("Error!!! Unable to calculate the NetSalary.");
		}
	}
}