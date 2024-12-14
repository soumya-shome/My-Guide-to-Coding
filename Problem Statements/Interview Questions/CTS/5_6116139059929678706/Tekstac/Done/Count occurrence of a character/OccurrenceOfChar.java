import java.util.Scanner;

public class OccurrenceOfChar {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,c=0;
		
		System.out.println("Enter a word:");
		String str=sc.nextLine();
		for(i=0;i<str.length();i++){
		    if(!(Character.isLetter(str.charAt(i)))){
		        System.out.println("Not a valid string");
		        return;
		    }
		}
		
		System.out.println("Enter the character:");
		char key=sc.next().charAt(0);
		if(!(Character.isLetter(key))){
		    System.out.println("Given character is not an alphabet");
		    return;
		}
		
		for(i=0;i<str.length();i++){
		    if(str.charAt(i)==key)
		        c++;
		}
		if(c==0)
		    System.out.println("The given character '"+key+"' not present in the given word.");
		else
		    System.out.println("No of '"+key+"' present in the given word is "+c);
	}

}