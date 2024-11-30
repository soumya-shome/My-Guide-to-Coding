
import java.util.*;
class emirp{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int n=0;
        int num2=num;
        for(int i=1;i<=num;i++){
            if(num%i==0)
                n++;
        }
        int rev=0;
        while(num2!=0){
            int d=num2%10;
            rev=rev*10+d;
            num2=num2/10;
        }
        int n2=0;
        for(int i=1;i<=rev;i++){
            if(rev%i==0)
                n2++;
        }
        if(n==2 && n2==2){
            System.out.println("emirp number");
        }

    }
}