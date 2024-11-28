import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String source=sc.next();
	    //FILL THE CODE
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	    sd.setLenient(false);
	    try
	    {
	        Date javaDate = sd.parse(source); 
	        System.out.println(source+" is a valid date");
	    }
	    catch (ParseException e)
	    {
	        System.out.println(source+" is not a valid date");
	    }
	}

}
