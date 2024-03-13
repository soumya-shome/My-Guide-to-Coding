import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Fill your code here
		Map<Integer,String> li=new TreeMap<>();
		System.out.println("Enter number of elements to add");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++){
		    System.out.println("Enter the country code");
		    int code=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the country name");
		    String name=sc.nextLine();
		    li.put(code,name);
		}
		System.out.println(li);
	}

}