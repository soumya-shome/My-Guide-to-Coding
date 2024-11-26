import java.util.*; // Including java.util package in the program
public class prog3 // Declaration of class
{                        // Class begins
    public static void main(String args[]) //Main method declaration
    { // Main method begins
        int i,j,n,sum=0; //Declaration of data members
        Scanner sc=new Scanner(System.in); // Creation of Scanner class object
        System.out.println("Enter the limit of the series");
        n=sc.nextInt();  // Storing the limit of the series
        for(i=0;i<n;i++) 
        { // Loop begins
            sum=sum+((int)(Math.pow(i,2)))+i+1; // Storing the sum of the series
        } //Loop ends
        System.out.println("The sum of the given series is:"+sum);
    } //End of main() 
}// End of class
