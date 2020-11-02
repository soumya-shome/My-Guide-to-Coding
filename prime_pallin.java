
class prime_pallin{
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
        int n2=n,a=0;
        while(n2!=0){
            int b=n2%10;
            a=a*10+b;
            n2=n2/10;
        }
        if(a==n)
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
                System.out.println(i);
        }
    }
}