class prog9         // Declaration of class check
{                    // class begins
    void prime(long num) // Method to print the prime digits of a number num with no return type
    {                    // void prime() begins
        long rem=0,n=num;    // Declaration of local variables 
        do                   // Declaration of do-while loop
        {                    // do-while loop begins 
            rem=num%10;          // stores the remainder of the number input by the user   
            num=num/10;          // stores the quotient of the number input by the user   
            if(rem==2||rem==3||rem==5||rem==7) // Checking for prime digits
                System.out.println("The prime digits of the number"+n+"are:"+rem); // Display statement
        }                    // End of do part
        while(num!=0);       // End of do-while loop
    }                    // void prime() begins
    int prime(int no)    // Method to check for a prime number with an integer return type  
    {                    // int prime() begins
        int i,c=0;           // Declaration of local variables
        for(i=1;i<=no;i++)   // Declaration of for loop with i as the control variable
        {                    // for-loop begins
            if(no%i==0)      // checking whether the number input by the user is divisible by each digit or not
                c++;             // Keeping the count of the number of times the number is divisible by each digit
        }                    // end of for-loop 
        if(c==2)             // Checking whether the counter is equal to or not 
            return 1;            // value 1 is returned if condition is satisfied  
        else                 // else-part
            return 0;            // value 0 is returned if condition is not satisfied 
    }                    // End of int prime() 
    void prime(int m, int n) // Method declared to input two integers,'m' and 'n' with no return type
    {                        // void prime() begins
        /*Condition to check whether both the numbers, 'm' and 'n' are prime or not and whether their 
         * difference is equal to 2 or not*/    
        if((prime(m)==1) && (prime(n)==1) && (Math.abs(m - n) == 2)  ) 
            System.out.println(m+" " + "and"+" " +n+"are twin primes");
        else  
            System.out.println(m+" "+"and"+" " +n+"are not twin primes");
    } // End of void prime()
} // End of class check 
