import java.text.*;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String source=sc.next();
	    int m=sc.nextInt();
		//FILL THE CODE
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	    sd.setLenient(false);
	    try {
	    	Date jD = sd.parse(source);
	    	Calendar c=Calendar.getInstance();
		    c.setTime(jD);
		    c.add(Calendar.MONTH, m);
		    Date dd=c.getTime();
		    DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		    System.out.println(df.format(dd));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	}

}
