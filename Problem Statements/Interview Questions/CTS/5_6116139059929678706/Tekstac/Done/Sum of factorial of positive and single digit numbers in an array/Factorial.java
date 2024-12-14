import java.util.Scanner;

public class Factorial {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<n;i++) {
			if(a[i]>=0 && a[i]<10) {
				int f=1;
				for(int j=1;j<=a[i];j++) {
					f=f*j;
				}
				sum=sum+f;
			}
		}
		if(sum!=0)
			System.out.println(sum);
		else
			System.out.println("No positive and single digit numbers found in an array");
	}

}
