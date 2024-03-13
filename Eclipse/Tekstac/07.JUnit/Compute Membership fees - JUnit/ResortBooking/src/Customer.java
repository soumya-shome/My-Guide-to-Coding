public class Customer {

	private int customerId;
	private String customerName;
	private String mobileNumber;
	private String membershipType;
	
	public Customer(){
		
	}

	public Customer(int customerId, String customerName, String mobileNumber, String membershipType) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.membershipType = membershipType;
	}
	
	public  double collectMembershipFees() {
	    
		if(membershipType.equalsIgnoreCase("Normal"))
			return 0;
		else if(membershipType.equalsIgnoreCase("Gold"))
			return 75000;
		else if(membershipType.equalsIgnoreCase("Platinum"))
			return 125000;
		else	
		    return 0;
	}

}