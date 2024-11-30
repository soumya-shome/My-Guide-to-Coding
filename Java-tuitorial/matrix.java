import java.util.*;
class matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter the values ");
        for(int i=0;i<3;i++)//rows
        {
            for(int j=0;j<3;j++)//columns
            {
                System.out.print("Position : "+i+" "+j+"=");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        int max=arr[0][0];
        int min=arr[0][0];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(max<arr[i][j])
                    max=arr[i][j];
                if(min>arr[i][j])
                    min=arr[i][j];
            }
        }
        
        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }
}