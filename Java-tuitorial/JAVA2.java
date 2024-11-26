class JAVA2
{
    public static void main(String[] args)
    {
        int s=5;
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(" ");
            }
            s--;
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i||i==5)
                {
                     System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        s--;
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(" ");
            }
            s++;
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i||i==5)
                {
                     System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}