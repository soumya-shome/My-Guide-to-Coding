import java.util.*;
class matrix_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int row=sc.nextInt();
        System.out.println("Enter no of Columns");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the values ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}