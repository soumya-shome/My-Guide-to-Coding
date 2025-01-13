class pt2
{
    public static void meth()
    {
        int s=7;
        for(int i=1;i<=8;i++)
        {
            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(" ");
            }
            s--;
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i=1;i<=8;i++)
        {
            for(int st=1;st<=4;st++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=4;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        }
    }