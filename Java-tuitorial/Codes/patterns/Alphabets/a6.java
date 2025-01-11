class Main
{
    public static void main(String[] args)
    {
        int k=65;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                char n=(char)k;
                System.out.print(n);
                k++;
            }
            System.out.println();
        }
    }
}