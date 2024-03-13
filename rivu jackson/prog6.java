import java.util.*; // Including java.util package in the program
class prog6     // Declaration of class
{                   // Class begins
    int fact(int n)     // method defined to calculate the factorial of number n input by the user 
    {                   // fact() begins
        int i,fact=1;       // Declaration of local variables
        if(n==0)            // Checking whether the number n is equal to 0 or not
            return 1;           // returns 1 if n=0
        else if(n==1)       // Checking whether the number n is equal to 1 or not
            return 1;           // returns 1 if n=1
        else 
            return n*fact(n-1); // returns the factorial in the integer format as return type is int
    }                   // End of main()
}                   
