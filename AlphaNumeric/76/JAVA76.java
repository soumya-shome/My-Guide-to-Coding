class JAVA76
{
    public static void main(String[] args)
    {
        int a=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            for(int p=5;p>=i;p--)
            {
                System.out.print((char)a);
            }
            System.out.println();
            a++;
        }
    }
}