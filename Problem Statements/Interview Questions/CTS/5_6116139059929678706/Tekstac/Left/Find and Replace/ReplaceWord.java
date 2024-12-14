import java.util.Scanner;

public class ReplaceWord {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the String:");
		String a=sc.nextLine();
		System.out.println("Enter the word to be searched:");
		String b=sc.nextLine();
		System.out.println("Enter the word to be replaced:");
		String r=sc.nextLine();
		
		int n=a.length(),c=0;
		Character dot=a.charAt(n-1);
		String  res="";
		String[] words=a.split("\\W");
		
		for(String word:words){
		    if(word.equals(b)){
		        res=res+r+" ";
		        c++;
		    }
		    else
		        res=res+word+" ";
		}
		if(c>=1){
		    System.out.print(res.trim());
		    if(dot=='.')
		        System.out.print(".");
		}
		else
		    System.out.print("The word "+b+" not found");
	}

}