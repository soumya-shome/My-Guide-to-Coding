import java.util.*;
public class MainTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of tourists: ");
		int n=sc.nextInt();
		String[] s=new String[n];
		System.out.println("Enter the details");
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
			sc.nextLine();
		}
		sc.close();
		TouristUtility t=new TouristUtility(n);
		for(int i=0;i<n;i++){
			String[] records=s[i].split(":");
			t.addValidToursist(records);
		}
		
		Tourist[] f=t.getTourists(); 
		for(int i=0;i<f.length;i++){
			System.out.println(f[i].getTouristName());
		}
		
	}
}
