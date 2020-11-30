import java.util.*;
class prime_array{
    boolean isPrime(int n){
        int f=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                f=1;
                break;
            }
        }
        if(f==1)
            return false;
        else
            return true;
    }
    public static void main(String[] args){
        prime_array ob=new prime_array();
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("Enter 10 numbers : ");
        for (int i=0;i<10;i++)
            a[i]=sc.nextInt();
        sc.close();
        System.out.print("Prime numbers : ");
        for(int i=0;i<10;i++){
            if(ob.isPrime(a[i]))
                System.out.print(a[i]+", ");
        }
    }
}