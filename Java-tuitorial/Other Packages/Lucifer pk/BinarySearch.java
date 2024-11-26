class BinarySearch
{
    public static void meth(int n)
    {
        int a[]={10,20,30,40,50,60,70,80};
        int l=0,u=7,m=0,f=0;

        while(l!=u)
        {
            m=(l+u)/2;
            if(n>a[m])
            {
                l=m+1;
            }
            else if(n<a[m])
            {
                u=m-1;
            }
            else if(n==a[m])
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("No. found if portion"+(m+1));
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
