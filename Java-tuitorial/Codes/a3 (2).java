class Main
{
    public static void main(String[] args)
    {
        int m=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            if(i>1)
            {
                for(int x=2;x<=i;x++)
                {
                    System.out.print(m);
                }
            }
            m++;
            System.out.println();
        }
    }
}
