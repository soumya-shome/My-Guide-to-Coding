class qww
{
    public static void main(String[] args) {

        int a=0;
        for(int i=1;i<=10;i++)
        {
            for(int s=1;s<=a;s++)
            {
                System.out.print(" ");
            }
            a++;
            for(int j=1;j<=a;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        a++;
        for(int i=10;i>=0;i--)
        {
            
            for(int s=a;s>=1;s--)
            {
                if(a==11)
                {
                    a--;
                }
                System.out.print(" ");
            }
            a--;
            for(int j=a;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
