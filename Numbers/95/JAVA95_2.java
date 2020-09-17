class JAVA95_2
{
    public static void main(String[] args)
    {
        int a;
        for(int i=1;i<=5;i++)
        {
            if(i%2==0)
                a=0;
            else
                a=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a);
                if(a==0)
                    a=1;
                else
                    a=0;
            }
            System.out.println();
        }
    }
}