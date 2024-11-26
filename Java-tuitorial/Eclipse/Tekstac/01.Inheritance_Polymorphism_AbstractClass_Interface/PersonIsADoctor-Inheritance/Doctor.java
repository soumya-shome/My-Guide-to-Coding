public class Doctor extends Person// inherit name from Person in Doctor class
{
//inlcude the required attribute and method as per the problem statement
    String specializationType;
    
    Doctor(String name,String specializationType){
    	super(name);
    	this.specializationType=specializationType;
    }
    
    public String displayDetails(){
        return (name+" is a "+specializationType);
    }

}