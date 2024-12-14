class la
{
    public static void meth()
    {
        for(int i=1;i<=20;i++)
        {
            for(int k=2;k<=i;k+=2)
            {
                System.out.print("*   1");
            }
            System.out.print("-");
            for(int l=0;l<=i;l+=2)
            {
                System.out.print("+   9");
            }
            System.out.println();
        }
    }
}