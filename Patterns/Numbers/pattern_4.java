/*
2
24
246
2468
*/
class pattern_4
{
    public static void main(String[] args)
    {
        for( int i = 2;i<=8;i+=2)
        {
            for( int j =2;j<=i;j+=2)
            {
                System.out.print( j );
            }
            System.out.println();
        }
    }
}
        