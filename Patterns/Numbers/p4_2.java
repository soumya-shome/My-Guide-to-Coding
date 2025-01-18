/*
12345
23451
34511
45111
51111
 */
class p4_2
{
    public static void main(String[] args){
        int m=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            if(i>1)
            {
                for(int k=1;k<=i-1;k++)
                {
                    System.out.print(m);
                }
            }
            
            System.out.println();
        }
    }
}
