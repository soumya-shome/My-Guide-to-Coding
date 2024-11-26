class sl
{
    public static void meth()
    {
        int s=7;
        System.out.println("        *");
        int e=2;
        for(int i=1;i<=3;i++)
        {
            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(" ");
            }
            s--;
            for(int j=1;j<=e;j++)
            {
                System.out.print("*"+"*");
            }
            e++;
            System.out.println();
        }
        System.out.println("*******************");
        System.out.println(" *****************");
        System.out.println("   *************");
        System.out.println(" *****************");
        System.out.println("*******************");
        int e2=4;
        int s2=5;
        for(int i=1;i<=3;i++)
        {
            for(int sp=s2;sp>=1;sp--)
            {
                System.out.print(" ");
            }
            s2++;
            for(int j3=e2;j3>=1;j3--)
            {
                System.out.print("*"+"*");
            }
            e2--;
            System.out.println();
        }
        System.out.println("        *");
    }
}