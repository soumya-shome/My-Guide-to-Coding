import java.util.Scanner;
class OoE{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        sc.close();
        if(a%2!=0){
            System.out.println(a+" is a Odd Number");
        }else{
            System.out.println(a+" is a Even Number");
        }
    }
}