import java.util.Scanner;

public class HighestMarkPerSem {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of semester");
		int n=sc.nextInt();
		int sem[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter no of subjects in "+(i+1)+" semester:");
			sem[i]=sc.nextInt();
		}
		int f=0;
		
		int max[]=new int[n];
		
		
		for(int i=0;i<n;i++) {
			int max2=0;
			System.out.println("Marks obtained in semester "+(i+1));
			int m=sc.nextInt();
			if(m>0 && m<100)
				max2=m;
			else
				f=1;
			for(int j=1;j<sem[i];j++) {
				int ma=sc.nextInt();
				if(ma>0 && ma<100) {
					if(max2<ma)
						max2=ma;
				}
				else {
					f=1;
					break;
				}
			}
			if(f==0) {
				max[i]=max2;
			}
			else {
				break;
			}
		}
		
		if(f==0) {
			for(int i=0;i<n;i++) {
				System.out.println("Maximum mark in "+(i+1)+" semester:"+max[i]);
			}
		}
		else {
			System.out.println("You have entered invalid mark.");
		}
	}

}
