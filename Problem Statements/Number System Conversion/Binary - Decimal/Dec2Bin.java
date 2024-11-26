import java.util.*;
class Dec2Bin
{
    int convert(int n) {
        int bin = 0;
        int rem, i = 1;
        while (n != 0) {
            rem = n % 2;
            n /= 2;
            bin += rem * i;
            i *= 10;
        }
        return bin;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a decimal number");
        int n=sc.nextInt();
        sc.close();
        Dec2Bin ob=new Dec2Bin();
        System.out.print(n+" in decimal = "+ob.convert(n)+" in binary");   
    }
}