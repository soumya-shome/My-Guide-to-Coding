import java.util.*; // Including java.util package in the program
class prog5 // Declaration of class
{ // Class begins
    public static void main(String[] args) // Declaration of main()
    {                                      // main() begins
        int i,j,rows,choice;                   //Declaration of data members
        Scanner sc = new Scanner(System.in);   // Creation of scanner class object
        System.out.println("**** MENU ****");
        System.out.println("1.PATTERN 1");
        System.out.println("2.PATTERN 2");
        System.out.println("Enter your choice");
        choice=sc.nextInt(); // Storing the choice from the user
        switch (choice)
        {
            case 1: // Printing the first pattern
            System.out.println("Enter the number of rows:");
            rows = sc.nextInt(); // Storing the number of rows input by the user
            for (i=1;i<=rows;i++) // Loop for the rows
            {
                for (j=1;j<=i;j++) // Loop for the columns
                {
                    if(j%2==0) // Checking whether the column is even or not 
                    {
                        System.out.print(0);
                    }
                    else
                    {
                        System.out.print(1);
                    }
                } // Inner loop ends
                System.out.println();
            } // Outer loop ends
            //sc.close();
            break; // Terminates the program after printing the pattern
            case 2: // Printing the second pattern
            //Taking rows value from the user
            System.out.println("Enter the number of rows: ");
            rows = sc.nextInt(); // Storing the number of rows from the user
            for (i=rows+1;i>=2;i--) // Loop for the rows
            { // Outer loop begins
                for (j=rows+1;j>=i;j--) // Loop for the columns
                { // Inner loop begins
                    System.out.print(j+" ");
                } // Inner loop ends
                System.out.println();
            } //Outer loop ends
            //sc.close();
            break; // Terminates the program after printing the pattern
        } // End of switch-statement
    } // End of main()
} // End of class
