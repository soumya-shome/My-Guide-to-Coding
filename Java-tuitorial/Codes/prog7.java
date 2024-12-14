class prog7            // Declaration of class
{                            // Class Begins
    void polygon(int n, char ch) // Declaration of polygon() with n and ch as the arguments and no return type
    {                            // polygon() begins
        int i,j;                     // Declaration of local variables i and j
        for(i=1;i<=n;i++)            // Outer for loop declaration
        {                            // Outer loop begins
            for(j=1;j<=n;j++)        // Inner loop declaration  
            {                        // Inner loop begins
                System.out.print(ch); // Printing the elements 
            }                         // Inner loop ends
            System.out.println();     // Line breaks  
        }                             // Outer loop ends
    }                             // End of polygon() 
    void polygon(int x,int y)     // Declaration of polygon() with x and y as the arguments and no return type
    {                             // Polygon() begins
        int i,j;                  // Declaration of local variables i and j
        for(i=1;i<=y;i++)         // Outer for loop declaration
        {                         // Outer loop begins
            for(j=1;j<=x;j++)     // Inner loop declaration  
            {                     // Inner loop begins
                System.out.print('@'); // Printing @
            }                          // End of inner loop
            System.out.println();      // Line breaks    
        }                              // End of outer loop
    }                                  // End of polygon()
    void polygon()                     // Declaration of polygon() with no arguments passed and no return type
    {                                  // Polygon() begins   
        int i,j;                       // Declaration of local variables i and j 
        for(i=1;i<=3;i++)              // Outer for loop declaration
        {                              // Outer loop begins
            for(j=1;j<=i;j++)          // Inner loop declaration  
            {                          // Inner loop begins
                System.out.print("*"); // Printing *
            }                          // Inner loop ends
            System.out.println();      // Line breaks
        }                              // Outer loop ends
    }                                  // End of Polygon() 
}                                  // End of class

