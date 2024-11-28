import java.util.Scanner;
class p3
{
    public int gcd(int a1,int b1)
    {
        int gd=1;
        for(int i=1;i<=a1 && i<=b1;i++){
            if(a1%i==0 && b1%i==0)
                gd=i;
        }
        return gd;
    }
   
    public int lcm(int a2,int b2)
    {
        int i=1;
        int x=(a2>b2)?a2:b2;
        for(i=x;i<=a2*b2;i=i+x){
            if(i%a2==0 && i%b2==0)
                break;
        }
        return i;
    }
   
    public static void  main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b=sc.nextInt();
        p3 ob=new p3();
        System.out.println("L.C.M. = "+ob.lcm(a,b));
        System.out.println("G.C.D. = "+ob.gcd(a,b));
    }
}
