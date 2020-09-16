class JAVA10
{
    public static void main(String[] args)
    {
        for(int q=1;q<=5;q++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        int e=2;
        int s=3;
        for(int a=1;a<=3;a++)
        {
            for(int i=s;i>=1;i--)
            {
                System.out.print(" ");
            }
            s--;
            System.out.print("*");
            for(int b=1;b<=e;b++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            e+=2;
            System.out.println();
        }
        for(int j=1;j<=4;j++)
        {
            if(j!=1)
            {
                System.out.print(" ");
            }
            System.out.print("*"+" ");
        }
    }
}