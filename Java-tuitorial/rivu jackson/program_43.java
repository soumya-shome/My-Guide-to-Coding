public class program_43
{
    public static void main()
    {
        for (int i=1;i<=5;i++)
        {
            int a=4;
            int v=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(v+" ");
                v+=a;
                a--;
            }
            System.out.println();
        }
    }
}