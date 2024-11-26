import java.util.*;
class HCF
{
    int findHcf(int a,int b)
    {
        int h=1;
        for(int i=1;i<a*b;i++){
            if(a%i==0 && b%i==0)
                h=i;
        }
        return h;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        HCF ob=new HCF();
        int hc=ob.findHcf(a,b);
        System.out.println("HCF of "+a+" and "+b+" is "+hc);
    }
}