import java.util.*;
class sort_o_e_place{
    void funcswap(int [] a,int s){
 	for(int i=0;i<s;i+=2){
 		int t=i+1;
		if(t<s){
			int y=a[i];
			a[i]=a[t];
			a[t]=y;
		}
	}
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of terms : ");
	    int n=sc.nextInt();
    	int b[]=new int[n];
	    System.out.print("Enter "+n+" numbers : ");
	    for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        sc.close();
        sort_o_e_place ob=new sort_o_e_place();
        ob.funcswap(b,n);
	    System.out.print("The Swapped array : ");
	    for(int i=0;i<n	;i++)
		    System.out.print(b[i]+",");
    }
}