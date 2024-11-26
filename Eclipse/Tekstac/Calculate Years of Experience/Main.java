import java.text.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String source=sc.next();
		//FILL THE CODE
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date d1 = new Date();
	    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	    try {
	    	Date d2 = sd.parse(source);
	    	long diff=d1.getTime()-d2.getTime();
	    	long y=(diff / (1000l*60*60*24*365));
		    System.out.println(y+" years");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	}

}
