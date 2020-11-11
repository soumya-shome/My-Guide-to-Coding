class lo
{
    public static void main(String[] args)
    {
        int a[]={10,15,20};
        int b[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(j==0)
                {
                    if(i%2==0)
                        b[i][j]=a[j];
                }
                else if(j==1)
                {
                    if(i%2!=0)
                        b[i][j]=a[j];
                }
                else if(j==2)
                {
                    if(i%2==0)
                        b[i][j]=a[j];
                }
                else
                {
                    b[i][j]=0;
                }
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
