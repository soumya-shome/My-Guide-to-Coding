class JAVA39
{
    public static void main(String[] args)
    {
        char sp=' ';
        int s=0;
        for(int i=5;i>=1;i--)
        {
            for(int a=0;a<=s;a++)
            {
                System.out.print(sp);
            }
            s++;
            for(int j=i;j>=1;j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println( );
        }
        int t=4;
        for(int i=5;i>=1;i--)
        {
            for(int a=0;a<=t;a++)
            {
                System.out.print(sp);
            }
            t--;
            for(int j=i;j<=5;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println( );
        }
    }
}