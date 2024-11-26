public class Customer{
	private String name;
	private String panno;
	private String emailid;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Customer(String name, String panno, String emailid, int salary) {
		this.name = name;
		this.panno = panno;
		this.emailid = emailid;
		this.salary = salary;
	}
	
	public boolean equals(Object o) {
		Customer c=(Customer) o;
		if(c.emailid.equals(this.emailid) && c.panno.equals(this.panno))
			return true;
		else
			return false;
	}
}