import java.util.*;
class ArmstrongNo
{
    public boolean arm(int n)
    {
        int r=0;
        int o=n;
        while(n>0)
        {
            int d=n%10;
            r=r+(d*d*d);
            n=n/10;
        }
        if(o==r)
        {
            return true;
        }
        return false;
    }
    
    public void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int m=sc.nextInt();
        if(arm(m)==true)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}