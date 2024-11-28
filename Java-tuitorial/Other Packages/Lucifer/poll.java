class poll
{
    public static void metH()
    {
        int s=1;
        int e=7;
        int q=3;
        for(int i=1;i<=4;i++)
        {

            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=e;j++)
            {
                if(j==1 || j==e)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            if(i<4)
            {
                e=e-2;
                s++;
            }
            else
            {
                e++;
                s--;
            }
            System.out.println();
            if(i==4)
            {
                for(int r=1;r<=3;r++)
                {
                    for(int t=s;t>=1;t--)
                    {
                        System.out.print(" ");
                    }
                    s--;
                    for(int k=1;k<=e;k++)
                    {
                        if(k==1 || k==e)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    e=e+1;
                    System.out.println();
                }
            }
        }
    }
}
