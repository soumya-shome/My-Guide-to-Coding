class o1
{
    static void main()
    {
        for(int i=1;i<=50;i++)
        {
            int j=0;
            if(i%3==0)
            {
                System.out.print("Fizz");
                j++;
            }
            if(i%5==0)
            {
                System.out.print("Buzz");
                j++;
            }
            if(j==0)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}