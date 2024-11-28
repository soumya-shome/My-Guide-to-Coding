class JAVA12{
    public static void main(String[] args)
    {
        for(int s=4;s>=1;s--)
        {

            System.out.print("*"+" ");
        }
        System.out.println();
        int e=1;
        int sp=4;
        for(int a=1;a<=3;a++)
        {
            for(int s=1;s<=sp;s++)
            {
                System.out.print(" ");
            }
            sp--;
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