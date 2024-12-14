class p4
{
    public static void meth()
    {
        int m=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            if(i>1)
            {
                for(int k=1;k<=i-1;k++)
                {
                    System.out.print(m);
                }
            }
            
            System.out.println();
        }
    }
}
