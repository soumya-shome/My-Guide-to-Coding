import java.util.Scanner;

	public class UniqueChar {
	    static final int noofChars=256;
	    
	    static void printUnique(String str){
	        char[] chars=str.toCharArray();
	        for(char c:chars){
	            if(Character.isDigit(c)){
	                System.out.println("Invalid Sentence");
	                return;
	            }
	        }
	        
	        int[] count=new int[noofChars];
	        int i;
	        
	        for(i=0;i<str.length();i++)
	            if(str.charAt(i)!=' ')
	                count[(int)str.charAt(i)]++;
	        int n=i,p=0;
	        for(i=0;i<n;i++)
	            if(count[(int)str.charAt(i)]==1)
	                p++;
	        
	        if(p>0){
	            System.out.println("Unique characters:");
	            for(i=0;i<n;i++)
	                if(count[(int)str.charAt(i)]==1)
	                    System.out.println(str.charAt(i));
	        }
	        else
	            System.out.println("No unique characters");
	    }
	    
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the sentence:");
			String str=sc.nextLine();
			
			printUnique(str);
		}

	}