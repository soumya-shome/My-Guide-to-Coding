class p5
{
    public static void meth(int n)
    {
        int s=0;
        int d=0;
        int i=1;
        do
        {
            s=s+1;
            d=d+s;
            i++;
            System.out.print(d+",");
        }
        while(i<=n);
    }
}
        