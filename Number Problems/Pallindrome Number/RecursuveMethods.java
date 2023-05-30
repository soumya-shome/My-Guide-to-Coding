import java.util.*;
public class RecursuveMethods{
    int recPalin(int n,int m){
        if (n==0)
            return m;
        m=m*10+(n%10);
        return recPalin(n/10,m);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        RecursuveMethods ob=new RecursuveMethods();
        if(ob.recPalin(n,0)==n)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");
    }
}