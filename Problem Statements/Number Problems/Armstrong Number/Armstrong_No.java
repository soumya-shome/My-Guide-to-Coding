import java.util.*;
class Armstrong_No
{
    int num_digits(int n){
        int nd=0;
        for(nd=0;n!=0;nd++,n=n/10);
        return nd;
    }
    boolean arm(int n){
        int n2,t=num_digits(n),s=0;
        for(n2=n;n2!=0;n2/=10)
            s=s+(int)Math.pow(n2%10,t);
        if(n==s)
            return true;
        return false;
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number : ");
        int m=sc.nextInt();
        sc.close();
        Armstrong_No ob=new Armstrong_No();
        if(ob.arm(m)==true)
        {
            System.out.print(m+" is an Armstrong number");
        }
        else
        {
            System.out.print(m+" is not an Armstrong number");
        }
    }
}