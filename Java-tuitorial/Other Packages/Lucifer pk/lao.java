class lao
{
    public void pattern()
    {
        int sp=4;int k=1;
        for(int i=1;i<=5;i++)
        {
            for(int s=1;s<=sp;s++)
            {
                System.out.print(" ");
            }
            sp--;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k++;
                if(k==10)
                {
                    k=1;
                }
            }
            System.out.println();
        }
    }

    public void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern(char x,int n)
    {
        int s=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
    
    public  void main()
    {
        pattern();
        pattern(9);
        pattern('x',6);
    }
}

            