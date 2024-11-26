class JAVA40
{
    public static void main(String[] args)
    {
        System.out.print("*"+" ");
        System.out.println();
        int e=1;
        for(int a=1;a<=3;a++)
        {
            System.out.print("*");
            for(int b=1;b<=e;b++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            e+=2;
            System.out.println();
        }
        for(int j=1;j<=5;j++)
        {
            System.out.print("*"+" ");
        }
    }
}