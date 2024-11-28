class Series2
{
    public static void m(int n,int a)
    {
        int s=a;
        for(int i=1;i<=n;i++)
        {
            System.out.print(s+" ");
            s=s*10+a;
        }
    }
}