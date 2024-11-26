class JAVA59
{
    public static void main(String[] args)
    {
        int i,j;
        int m=5;
        for(i=1;i<=5;i++)
        {
            m--;
            for(int k=m;k>0;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            if(i>1)
            {
                for(int p=i-1;p>=1;p--)
                {
                    System.out.print(p);
                }
            }
            System.out.println();
        }
    }
}
                