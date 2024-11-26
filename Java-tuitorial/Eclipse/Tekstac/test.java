public class test {
    /*
    public static int palin(int n){
        int n1=n;
        int d=0;
        while(n1!=0){
            d=d*10+(n1%10);
            n1/=10;
        }
        if(d==n)
            return 1;
        else
            return 0;
    }
    */
    public static int fibo(int n){
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static int fact(int n){
        if(n==1)
            return 1;
        else   
            return n*fact(n-1);
    }

    public static int f(int n){
        if(n==0)
            return 0;
        else{
            System.out.println("hello");
            return f(n-1);
        }
    }

    public static void main(String[] args){
        //System.out.println(palin(3443));
        //for(int i=0;i<5;i++){
         //   System.out.println(fibo(i));
        //}
        System.out.println(f(3));
    }
}
