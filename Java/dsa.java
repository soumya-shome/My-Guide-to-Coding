class dsa
{
    public static void meth()
    {
        int a[]={8,9,7,3,2,1,6};
        int l=a.length;
        int small,pos;
        for(int i=0;i<l;i++)
        {
            small=a[i];
            pos=i;
            for(int j=i+1;j<l;j++)
            {
                if(a[j]<small)
                {
                    small=a[j];
                    pos=j;
                }
            }
            int t=a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
        System.out.println(l);
    
        for(int k=0;k<l;k++)
        {
            System.out.println(a[k]);
        }
    }
}