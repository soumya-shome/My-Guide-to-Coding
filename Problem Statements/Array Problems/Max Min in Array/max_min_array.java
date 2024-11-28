import java.util.*;
class max_min_array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
            a[i]=sc.nextInt();
        sc.close();
        int max=a[0];
        int min=a[0];
        for(int j=0;j<10;j++){
            if(a[j]>max)
                max=a[j];
            if(a[j]<min)
                min=a[j];
        }
        System.out.println("Maximum in Array : "+max);
        System.out.print("Minimum in Array : "+min);
    }
}