import java.util.Scanner;

public class FindLength {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,c=0;
		String str=sc.nextLine();
		
		for(i=0;i<str.length();i++){
		    if(Character.isLetter(str.charAt(i))||str.charAt(i)==' ')
		        c++;
		}
		
		if(str.length()==c)
		    System.out.println("No of characters is:"+c);
		else
		    System.out.println("Invalid String");
	}

}