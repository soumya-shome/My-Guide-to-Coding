
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double l=0.0;
		if(employeeObj instanceof PermanentEmployee) {
			l=0.15*(employeeObj.getSalary());
			return l;
		}
		else {
			l=0.10*(employeeObj.getSalary());
			return l;
		}
	}

}
