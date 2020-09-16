class JAVA76_1
{
    public static void main(String[] args)
    {
        int s=1;
        int r=65;
        int e=5;
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(s);
            }
            s++;
            char c=(char)r;
            for(int j=1;j<=e;j++)
            {
                System.out.print(c);
            }
            e--;
            r++;
            System.out.println();
        }
    }
}
