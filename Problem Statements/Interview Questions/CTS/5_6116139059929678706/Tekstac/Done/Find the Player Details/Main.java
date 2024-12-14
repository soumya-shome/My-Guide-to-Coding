import java.util.*;
public class Main  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Player[] pObj=new Player[4];
		pObj[0]=new Player(146,"Athul",16,9876543210l);
		pObj[1]=new Player(135,"Rakshana",16,9956231045l);
		pObj[2]=new Player(168,"Christy",16,9856471230l);
		pObj[3]=new Player(194,"Athulya",16,9768541230l);
		
		// Invoke the method findPlayerDetailsById in the PlayerUtility class and display results
		System.out.println("Enter the id to be searched");
		int n=sc.nextInt();
		PlayerUtility p1=new PlayerUtility();
		Player p=p1.findPlayerDetailsById(pObj,n);
		System.out.println("Name:"+p.getPlayerName());
		System.out.println("Phone number:"+p.getPhoneNumber());
	}
}