import java.util.*;
class BinarySub{
    int binAddition(int a,int b)
    {
        int c;
        while (b != 0) {
                c = (a & b) << 1;
                a=a^b;
                b=c;
        }
        return a;
    }
    int binSubtracton(int a, int b)
    {
        int carry;
        b = binAddition(~b, 1);
        while (b != 0) {
                carry = (a & b) << 1;
                a = a ^ b;
                b = carry;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input first integer value: ");
        int n1=sc.nextInt();
        System.out.print("Input second integer value: ");
        int n2=sc.nextInt();
        sc.close();
        BinarySub ob=new BinarySub();
        int binSub=ob.binSubtracton(n1,n2);
        System.out.print("Binary Subtraction: "+binSub);
    }
}