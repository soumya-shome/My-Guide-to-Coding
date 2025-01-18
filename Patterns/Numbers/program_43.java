/*
1 
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
public class program_43
{
    public static void main(String[] args)
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