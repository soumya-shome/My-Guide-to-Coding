class JAVA28
{
    public static void main(String[] args)
    {
        char sp=' ';
        int t=4;
        for(int i=1;i<=4;i++)
        {
            for(int a=0;a<=t;a++)
            {
                System.out.print(sp);
            }
            t--;
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println( );
        }
        int s=0;
        for(int i=1;i<=5;i++)
        {
            for(int a=0;a<=s;a++)
            {
                System.out.print(sp);
            }
            s++;
            for(int j=i;j<=5;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println( );
        }
        
    }
}