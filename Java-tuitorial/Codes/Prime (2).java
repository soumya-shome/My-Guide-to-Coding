public class Prime {
    public static void main( String args[] )
    {
        int x, y, c = 0;
        for( x = 2; x < 1000; x++ )
        {
            if( x % 2 != 0 || x == 2 )
            {
                for( y = 2; y <= x / 2; y++ )
                {
                    if( x % y == 0 )
                    {
                        break;
                    }
                }

                if( y > x / 2 )
                {
                    System.out.println( x );
                    c++;
                }
            }
        }
        System.out.println( "\nTotal: " + c );
    }

}
