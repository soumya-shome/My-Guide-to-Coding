/*
 *     
 *  1
   121
  12321
 1234321
123454321
 */
class p1_3
{
    public static void main(String[] args)
    {
        int z=1;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=i-1;k>=-(i-1);k--)
            {
                System.out.print(i-Math.abs(k));
            }
            z+=2;
            System.out.println();
        }
    }
}