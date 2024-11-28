class p4
{
    public static void main()
    {
        for(int i=0;i<=200;i++)
        {
            int n = i;
            int b=0;
            while(n!=0)
            {
                int c = n%10;
                b = b*10+c;
                n = n/10;
            }
            if(i==b){
                System.out.println(i);
            }
        }
    }
}