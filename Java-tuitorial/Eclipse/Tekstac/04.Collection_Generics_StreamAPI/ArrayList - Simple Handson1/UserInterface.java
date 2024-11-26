import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Fill your code here
		List<String>  sl=new ArrayList<String>();
		System.out.println("Enter number of elements to add");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++)
		{
		    String n=sc.nextLine();
		    sl.add(n);
		}
		System.out.println(sl);
	}

}