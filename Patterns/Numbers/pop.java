/*
12345 54321
1234   4321
123     321
12       21
1         1
 */
class pop
{
    public static void main(String[] args)
    {
        int p=5,d=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=p;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<=d;k++)
            {
                System.out.print(" ");
            }
            for(int k=p;k>=1;k--)
            {
                System.out.print(k);
            }
            p=p-1;
            d=d+2;
            System.out.println();
        }
    }
}