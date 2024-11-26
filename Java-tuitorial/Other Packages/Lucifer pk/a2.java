class a2
{
    public static void meth()
    {
        int m=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(m<=10)
                {
                    System.out.print(m+" ");
                }
                else
                {
                    System.out.print(m);
                }
                m++;
            }
            System.out.println();
        }
    }
}