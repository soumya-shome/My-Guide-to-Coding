import java.util.Scanner;                 // Including java.util package in the program
class prog10                  // Declaration of class
{                                         // Class begins
    public static void main(String args[])    // Declaration of main()
    {                                         // main() begins
        Scanner sc = new Scanner(System.in);      // Scanner class declaration and creation of its object
        System.out.println("Enter the amount: "); 
        int amt = sc.nextInt();                   // Accepting the value from the user
        if (amt > 99999)                          // Checking whether amount input is > 99999 or not
        {                                         // if-block begins
            System.out.println("Invalid Amount");     // Displays "Invalid amount" if condition is satisfied   
            return;                                   // returns null 
        }                                         // End of if-block
        /*Getting the amount in words and storing it by calling getAmtInWords()*/
        String amtInWords = getAmtInWords(amt);   
        System.out.println(amtInWords);           // Printing the amount in words
        System.out.println("Denomination:");
        /* Assigning the various denominations to an integer array,notes[]*/
        int notes[] = {2000, 500, 200, 100, 50, 20, 10, 1}; 
        int t = amt;                               // assigning the value of amt to t
        for(int i = 0; i < notes.length; i++)      // Declaration of for loop with i as the control variable 
        {                                          // for-loop begins
            /* Dividing the amount by each denomination and storing the quotient only in integers*/
            int c = t / notes[i];
            if (c != 0)
                System.out.println(notes[i] + "\t*\t" + c + "\t=\t" + (c * notes[i]));
            /* Dividing the amount stored in t by each denomination and storing the remainder in integers*/
            t = t % notes[i];   
        }                                          // for-loop ends
    }                                          // End of main()
    // Declaration of a static getAmtInWords() with a String return type
    static String getAmtInWords(int amt)       
    {
        StringBuffer sb = new StringBuffer();      // Creation of StringBuffer class object, sb.
        while (amt != 0)                           // Entry-controlled loop
        {                                          // Entry-controlled loop begins  
            int d =  amt % 10;                         // storing the remainder
            amt /= 10;                                 // storing the quotient
            switch (d)                                 // A variable d passed through switch
            {                                          // switch begins 
                case 0:                                    // case-0   
                sb.insert(0, "Zero ");                     // Inserting "Zero" at index 0
                break;                                     // Termination
                case 1:                                    // case-1
                sb.insert(0, "One ");                      // Inserting "One" at index 0
                break;                                     // Termination
                case 2:                                    // case-2
                sb.insert(0, "Two ");                      // Inserting "Two" at index 0
                break;                                     // Termination 
                case 3:                                    // case-3  
                sb.insert(0, "Three ");                    // Inserting "Three" at index 0
                break;                                     // Termination
                case 4:                                    // case-4  
                sb.insert(0, "Four ");                     // Inserting "Four" at index 0 
                break;                                     // Termination
                case 5:                                    // case-5
                sb.insert(0, "Five ");                     // Inserting "Five" at index 0 
                break;                                     // Termination
                case 6:                                    // case-6 
                sb.insert(0, "Six ");                      // Inserting "Six" at index 0
                break;                                     // Termination
                case 7:                                    // case-7
                sb.insert(0, "Seven ");                    // Inserting "Seven" at index 0
                break;                                     // Termination
                case 8:                                    // case-8
                sb.insert(0, "Eight ");                    // Inserting "Eight" at index 0 
                break;                                     // Termination
                case 9:                                    // case-9
                sb.insert(0, "Nine ");                     // Inserting "Nine" at index 0
                break;                                     // Termination
                default:                                   // default-block
                System.out.println("Invalid digit");       // displays "Invalid digit" otherwise   
            }                                          // End of switch-block 
        }                                          // End of entry-controlled loop
        return sb.toString();                      // Converts the numerical value to the string value and returns it
    }                                          // End of getAmtInWords()  
}                                          // End of class
