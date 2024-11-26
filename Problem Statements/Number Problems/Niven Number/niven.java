import java.util.Scanner;

public class niven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int n1=number;
        int sum=0;
        while(n1!=0){
            int r=n1%10;
            n1=n1/10;
            sum=sum+r;
        }

        System.out.println(sum);

        if (number%sum==0) {
            System.out.println(number + " is a Niven number.");
        } else {
            System.out.println(number + " is not a Niven number.");
        }

        scanner.close();
    }
}