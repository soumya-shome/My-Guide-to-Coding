class gcd
{
    public static void meth(int a,int b)
    {
        int c=a,d=b;
        while(a%b!=0)
        {
            int t=a%b;
            a=b;
            b=t;
        }
        System.out.println(b);
    }
}