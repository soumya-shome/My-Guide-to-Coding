class JAVA15
{
    public static void main(String[] args)
    {
        int s=1;
        int r=65;
        for(int i=1;i<=5;i++)
        {
            for(int p=1;p<=s;p++)
            {
                System.out.print(" ");
            }
            s++;
            for(int j=69;j>=r;j--)
            {
                char c=(char)j;
                System.out.print(c);
            }
            r++;
            System.out.println();
        }
    }
}