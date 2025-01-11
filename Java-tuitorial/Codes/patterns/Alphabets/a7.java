class Main
{
    public static void main(String[] args)
    {
        int c=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                char o=(char)c;
                if(i%2!=0)
                {
                    System.out.print(o);
                }
                else
                {
                    System.out.print("|");
                }

            }
            if(i%2!=0)
            {
                c++ ;
            }
            System.out.println();
        }
    }
}