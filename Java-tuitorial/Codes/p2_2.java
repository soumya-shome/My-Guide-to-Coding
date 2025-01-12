/*
12345
23452
34533
45444
55555
 */
class p2_2
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
