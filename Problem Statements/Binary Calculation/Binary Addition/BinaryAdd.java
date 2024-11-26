import java.util.*;
class BinaryAdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input first integer value: ");
        int n1=sc.nextInt();
        System.out.print("Input second integer value: ");
        int n2=sc.nextInt();
        sc.close();
        int c;
        while (n2 != 0) {
            c = (n1 & n2) << 1;
            n1=n1^n2;
            n2=c;
        }
        int binAdd=n1;
        System.out.print("Binary Addition: "+binAdd);
    }
}