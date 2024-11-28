import java.util.*; // Including java.util package in the program
class prog8   // Declaration of class 
{                   // Class begins
    int pronic(int n)   // pronic() declared with n as the only argument through the formal  parameters and integer as the return type
    {                   // pronic() begins 
        int i;              // Declaration of local variable i
        for(i=0;i<=(int)(Math.sqrt(n));i++) // Declaration of for loop wherein i is the control variable
        {                                   // for loop begins
            // Checking Pronic number by multiplying consecutive numbers    
            if(n==i*(i+1))
                return 1; // returns 1 if the condition is satified
        }
        return 0; // returns 0 otherwise
    } // End of pronic()
    public static void main(String args[]) // Declaration of main()
    {                                      // main() begins
        int number,p=0;                        // Declaration of variables number and p
        Scanner sc=new Scanner(System.in);     // Creation of scanner class object sc   
        System.out.println("Enter a number");  
        number=sc.nextInt();                   // Storing the input from user
        prog8 obj= new prog8();        // Creation of the user-defined class object 
        p=obj.pronic(number);                  // pronic() called with argument number passed through the actual parameters 
        System.out.println(p);                 // Printing the output 
    }                                      // End of main() 
}                                      // End of class
