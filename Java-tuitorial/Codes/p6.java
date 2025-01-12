class p6
{
    public static void main(String[] args)
    {
        
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            if(i<=5)
            {
                for(int h=1;h<=i-1;h++)
                {
                    System.out.print("5");
                }
            }
            System.out.println();
        }
    }
}