import java.util.*;
import java.text.*;
import java.text.ParseException;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    //FILL THE CODE
	    String date=sc.nextLine();
	    
	        try{
	           
	            convertStringToDate(date);
	            System.out.println(date+" is a valid date");
	        }
	        catch(ParseException e){
                System.out.println(date+" is not a valid date");	        
	            
	        }
	    
	}
	
	public static Date convertStringToDate(String str) throws ParseException  {
	  
	  while(str.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date d=sdf.parse(str);
	  if(true)
	  return d;
        else
	    return null;
    }
    return null;
	}

}