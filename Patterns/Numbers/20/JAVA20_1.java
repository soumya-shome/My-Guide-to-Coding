public class JAVA20_1
{
    public static void main(String[] args)
    {
        int s=0;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(s);
                s=s+1;
            }
            System.out.println();
        }
    }
}