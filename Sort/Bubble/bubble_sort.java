import java.util.*;
class bubble_sort
{
    void bubbleSort(int arr[],int n){
        int i,j;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    void printArray(int arr[],int n){
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of items : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the no.s : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        bubble_sort ob=new bubble_sort();
        System.out.print("Original Array : ");
        ob.printArray(arr, n);
        
        ob.bubbleSort(arr, n);
        System.out.print("Sorted Array : ");
        ob.printArray(arr, n);
    }
}
