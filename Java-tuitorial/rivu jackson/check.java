class check{
    public static void main(){
        int sum=0;
        for(int i=0, j=0;i<5 & j<5;++i,j=i+1)
            sum+=i;
        System.out.println(sum);
        /*
        byte b=50;
        b=b*50;
        System.out.println(b);
        */
        int a=1;
        int b=2;
        int c,d;
        c=++b;
        d=a++;
        c++;
        b++;
        ++a;
        System.out.println(a+" "+b+" "+c);
        
        int var1=5;
        int var2=6;
        if((var2=1)==var1)
            System.out.println(var2);
        else
            System.out.println(++var2);
        
        final int a1=10,b1=20;
        while(a<b)
            System.out.println("Hello");
        System.out.println("World");
    }
}