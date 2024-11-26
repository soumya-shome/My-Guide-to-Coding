import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidPriceException{
		Scanner sc=new Scanner(System.in);
		
	    //FILL THE CODE
	    System.out.println("Enter product name");
	    String prod=sc.nextLine();
	    System.out.println("Enter price");
	    int price=sc.nextInt();
	    
	        try{
	            if(price>=100)
	            {
        	            System.out.println("Name : "+prod);
        	            System.out.println("Price : "+price);
	            }
	            else
	            	throw new InvalidPriceException("InvalidPriceException - Product price invalid");
	        }
	        catch(InvalidPriceException e){
	            System.out.println(e.getMessage());
	        }
	    
	   
	}
}