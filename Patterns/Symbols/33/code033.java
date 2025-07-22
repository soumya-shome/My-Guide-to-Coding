class code033
{
    public static void main(String[] ars)
    {
        int s=1;
        int e=5;
        for(int i=1;i<=3;i++)
        {
            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(" ");
            }
            s++;
            System.out.print("*");
            for(int j=1;j<=e;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            e-=2;
            System.out.println();
        }
        for(int s1=1;s1<=4;s1++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        int s2=3;
        int e2=1;
        for(int i=1;i<=3;i++)
        {
            for(int sp=1;sp<=s2;sp++)
            {                                         
                System.out.print(" ");
            }
            
            s2--;
            System.out.print("*");
            for(int j=1;j<=e2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            e2+=2;
            System.out.println();                                                                                                                                                                                                
        }
    }
}
            