import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Fill your code here
		Set<String> sl=new TreeSet<String>();
		System.out.println("Enter number of elements to add");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++){
		    String s=sc.nextLine();
		    sl.add(s);
		}
		System.out.println(sl);
	}

}