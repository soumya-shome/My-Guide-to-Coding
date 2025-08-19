import java.util.*;
public class linear_search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int array[] = new int[size];

        for(int j=0;j<size;j++)
        {
            System.out.print("Enter "+(j+1)+" Element: ");
            array[j]=sc.nextInt();
        }

        System.out.print("array[ ");
        for(int i = 0;i<size;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println("]");

        int loc = -1;
        System.out.print("Enter Value To Search in Array : ");
        int key = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(key==array[i])
            {
                loc = i;
                break;
            }
        }
        if(loc!=-1)
            System.out.println("Value Found At Index Number : "+loc);
        else
            System.out.println("Value not found in Array");
    }
}