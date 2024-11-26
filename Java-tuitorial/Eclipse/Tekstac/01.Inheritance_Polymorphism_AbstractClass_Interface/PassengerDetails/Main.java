import java.util.*;
public class Main{
	public static void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of passengers:");
		int n=sc.nextInt();
		Passenger[] ob=new Passenger[n];
		for(int i=1;i<=n;i++){
			System.out.println("Passenger "+i);
			System.out.println("Enter the ticketid");
			int t=sc.nextInt();
			
			System.out.println("Enter the name");
			String name=sc.next();
			
			System.out.println("Enter the gender");
			String g=sc.next();
			
			System.out.println("Enter the address");
			String address=sc.next();
			ob[i-1]=new Passenger(t,name,g,address);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(ob[i].toString());
		}
		
	}
}