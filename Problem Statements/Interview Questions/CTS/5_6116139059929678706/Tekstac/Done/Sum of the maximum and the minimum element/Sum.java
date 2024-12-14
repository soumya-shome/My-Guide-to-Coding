import java.util.*;

public class Sum {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        
        if(size >= 1){
            System.out.println("Enter the elements:");
            int[] arr = new int[size]; 
        
            for(int i = 0; i < size; i++)
                arr[i] = sc.nextInt();
        
            Arrays.sort(arr);
            
            System.out.println(arr[size-1]+arr[0]);
        }
        else
            System.out.println("Invalid Array Size");
	}

}
