
public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}

	public double getNetSalary() {
		return netSalary;
	}
	
	public void setNetSalary(double netSalary) {
		this.netSalary=netSalary;
	}
	public void calculateNetSalary(int pfpercentage) {
		netSalary=salary-(salary*pfpercentage/100);
		setNetSalary(netSalary);
	}
	
	
}
