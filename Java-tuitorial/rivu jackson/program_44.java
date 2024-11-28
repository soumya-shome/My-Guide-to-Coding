public class program_44
{
    public static void main()
    {
        int s=1;
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(" ");
            }
            s++;
            for(int j=i;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        s-=2;
        for(int i=4;i>=1;i--)
        {
            for(int sp=s;sp>=1;sp--)
            {
                System.out.print(" ");
            }
            s--;
            for(int j=i;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}