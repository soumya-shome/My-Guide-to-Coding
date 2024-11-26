import java.util.*;
class Triangle
{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int m,n,p,a,b,c;
        double area=0,s;
        System.out.println("menu");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("equi");
            s=sc.nextInt();
            area=((Math.sqrt(3))/4)*s*s;
            break;
            
            case 2:
            System.out.println("case 2");
            a=sc.nextInt();
            b=sc.nextInt();
            area=(b/4)*(Math.sqrt((4*a*a)-(b*b)));
            break;
            
            case 3:
            System.out.println("case 3");
            m=sc.nextInt();
            n=sc.nextInt();
            p=sc.nextInt();
            s=(m+n+p)/2;
            area=(Math.sqrt(s*(s-m)*(s-n)*(s-p)));
            
            break;
        }
        System.out.println("Area : "+area);
        
    }
}