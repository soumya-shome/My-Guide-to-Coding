/*
      *
    ** **
  ***   ***
****     ****
 */
class ol
{
    public static void main(String[] args)
    {
        for(int l=1;l<=3;l++)
        {
            int s=6;int t=1;
            for (int i=1;i<=4;i++)
            {
                for(int sp=1;sp<=s;sp++)
                {
                    System.out.print(" ");
                }
                s-=2;
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                if(i>1)
                {
                    for(int sp=1;sp<=t;sp++)
                    {
                        System.out.print(" ");
                    }
                    t+=2;
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }}