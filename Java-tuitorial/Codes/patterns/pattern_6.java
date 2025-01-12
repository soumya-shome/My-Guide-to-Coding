class pattern_6
{
    public static void main()
    {
        int s=4;
        for(int i=1;i<=4;i++)
        {
            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(" ");
            }
            s--;
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}