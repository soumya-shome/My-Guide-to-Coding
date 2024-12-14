import java.util.Scanner;

public class Count {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String s=sc.nextLine();
		int t=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLetter(c) || c==' ') {
				t=t+1;
			}
			else {
				t=0;
				break;
			}
		}
		if(t!=0) {
			System.out.println(s+" has "+t+" characters");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
