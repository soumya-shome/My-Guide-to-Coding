public class PermanentEmployee extends Employee{
	private float pfpercentage;
	private float pfamount;
	public float getPfpercentage() {
		return pfpercentage;
	}
	public void setPfpercentage(float pfpercentage) {
		this.pfpercentage = pfpercentage;
	}
	public float getPfamount() {
		return pfamount;
	}
	public void setPfamount(float pfamount) {
		this.pfamount = pfamount;
	}
	 public void findNetSalary() {
		 setPfamount(getSalary()*pfpercentage/100);
		 System.out.println(pfamount);
		 setNetsalary(getSalary()-getPfamount());
	 }
	 
	 public boolean validateInput() {
		 if(pfpercentage>=0 && getSalary()>0)
			 return true;
		 else
			 return false;
	 }
	
}