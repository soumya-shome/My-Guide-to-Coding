import java.util.Scanner;
class Dec2Hex
{    
    public String toHex(int decimal){    
        int rem;  
        String hex="";   
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
        while(decimal>0)  
        {  
        rem=decimal%16;   
        hex=hexchars[rem]+hex;   
        decimal=decimal/16;  
        }  
        return hex;  
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int n=sc.nextInt();
        sc.close();
        Dec2Hex ob=new Dec2Hex();
        System.out.println(n+" in decimal = "+ob.toHex(n)+" in hexadecimal");  
    }
}      