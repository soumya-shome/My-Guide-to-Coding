import java.util.*; // Including java.util package in the program
public class prog2 // Declaration of class
{                        // Class begins
    public static void main(String args[]) //Main method declaration
    { // Main method begins
        int i,n,a=1,b=0,c; //Declaration of data members
        Scanner sc=new Scanner(System.in); // Creation of Scanner class object
        System.out.println("Enter the limit of the series");
        n=sc.nextInt();  // Storing the limit of the series
        for(i=1; i<=n; i++) 
        { // Loop begins
            c= a + 2*b; // Storing the digit from the 3rd position of the series
            System.out.print(c+" "); // Printing the series
            // Swapping values
            a = b; 
            b = c;
        } // Loop ends
    } // End of main()
} // End of class
