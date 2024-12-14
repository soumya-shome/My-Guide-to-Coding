class test1{
    public void check(){
        /*
        int a=10;
        switch(a){
        case 10:System.out.print(a+++" ");
        case 11:System.out.print(++a+" ");
        case 12:System.out.print(a+++" ");
        break;
        default: System.out.println(a++);
        }
        System.out.println(a);

        int a=10,b=20;
        if((a<b)||(a=5)>10)
        System.out.print(b);
        else
        System.out.print(a);
         */
        //System.out.print(-2+10%4+12);
        /*
        int k=5,j=9;
        k+=k++-++j+k;
        System.out.println(k);
        System.out.println(j);

        for(int m=5;m<=20;m+=5){
        if(m%3==0)
        break;
        else
        if(m%5==0)
        System.out.print(m+" ");
        continue;
        }
        char c='a';
        switch(c){
        case 'a':System.out.print("A");
        case 'b':System.out.print("B");
        default:System.out.print("C");
        }
         */
        if(5>10||7==7)
            System.out.println("t");
        else
            System.out.println("f");
    }

    public static void main(){
        test1 o=new test1();
        o.check();
    }
}