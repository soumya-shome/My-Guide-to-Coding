import java.util.*;
class Bin2Dec
{
    int convert(int n) {
        int dec = 0, i = 0, rem;
        while (n != 0) {
            rem = n % 10;
            n /= 10;
            dec += rem * (int)Math.pow(2, i);
            ++i;
        }
        return dec;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a binary number ");
        int n=sc.nextInt();
        sc.close();
        Bin2Dec ob=new Bin2Dec();
        System.out.print(n+" in binary = "+ob.convert(n)+" in decimal");   
    }
}