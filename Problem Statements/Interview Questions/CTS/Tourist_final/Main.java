import java.util.*;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        TouristUtitility t=new TouristUtitility();
        System.out.println("Enter the number of tourists");
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        System.out.println("Enter the tourist details");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            String[] records=arr[i].split(":");
            t.addValidTourist(records);
        }
        String[] ret=t.calculateTravelCost();
        for(int i=0;i<ret.length;i++)
        {
            System.out.println(ret[i]);
        }
    }
    
}