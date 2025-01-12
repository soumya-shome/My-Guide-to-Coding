/*
51111
45222
34533
23454
12345
 */
class p3_3
{
    public static void main(String[] args){
        int m=1;
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            if(i>1)
            {
                for(int x=i;x>=2;x--)
                {
                    System.out.print(m);
                }
            }
            m++;
            System.out.println();
        }
    }
}
