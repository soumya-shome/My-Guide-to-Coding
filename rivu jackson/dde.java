import java.util.*;
class dde{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int count=0;
        int addr=0;
        int n;
        System.out.print("Enter : ");
        for(int i=0; ;i++){
            n=sc.nextInt();
            count++;
            if(n%5==0)
            {
                a[addr]=n;
                addr++;
            }
            if(addr>=5)
            {
                break;
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("Count="+count);
    }
}