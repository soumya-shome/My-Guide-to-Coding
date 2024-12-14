import java.util.Scanner;

public class Authority {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		int i,c=0;
		System.out.print("Inmate's name:");
		String child=sc.nextLine();
		System.out.print("Inmate's father's name:");
		String father=sc.nextLine();
		
		String con=child.concat(" "+father);
		
		for(i=0;i<con.length();i++){
		    if(Character.isLetter(con.charAt(i))||con.charAt(i)==' ')
		        c++;
		}
		if(con.length()==c)
		    System.out.println(con.toUpperCase());
		else
		    System.out.println("Invalid name");
	}

}