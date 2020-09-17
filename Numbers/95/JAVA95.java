
public class JAVA95
{
    public static void main(final String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("A");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

