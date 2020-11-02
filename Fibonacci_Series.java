class Fibonacci_Series{
    static void main(int n){
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }
    }
}