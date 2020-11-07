
class prime_fibo{
    int prime(int n){
        int f=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                f++;
        }
        if(f==2)
            return 1;
        else
            return 0;
    }
    
    int pallin(int n){
        int a=0,b=1,c;
        c=a+b;
        while(c<n){
            c=a+b;
            a=b;
            b=c;
        }
        if(c==n)
            return 1;
        else
            return 0;
    }
    
    public void main(){
        for(int i=1;i<=1000;i++)
        {
            int x=prime(i);
            int y=pallin(i);
            if((x+y) ==2)
                System.out.println(i+"Prime Pallin");
            //else
              //  System.out.println(i);
        }
    }
}