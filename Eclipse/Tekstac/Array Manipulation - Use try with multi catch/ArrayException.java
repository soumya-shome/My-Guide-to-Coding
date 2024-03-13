import java.util.*;
public class ArrayException{
    Scanner sc=new Scanner(System.in);
    public String getPriceDetails(){
        
        System.out.println("Enter the number of elements in the array");
        int size=sc.nextInt();
        try{
            
            System.out.println("Enter the price details");
            int arr[]=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access");
            int index=sc.nextInt();
            return "The array element is "+arr[index];
        }
        catch(ArrayIndexOutOfBoundsException e){
            return "Array index is out of range";
        }
        catch(InputMismatchException e){
            return "Input was not in the correct format";
        }
    }
    public static void main (String[] args) {
        /* code */
        ArrayException a=new ArrayException();
        System.out.println(a.getPriceDetails());
    }
}