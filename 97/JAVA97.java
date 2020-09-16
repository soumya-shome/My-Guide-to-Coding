class JAVA20
{
    public static void main(String[] args)
    {
        int n=5;
        int i,j,k,p=5;
        int s=1;
        for(i=0;i<n;i++)
        {
            for(k=p;k>=1;k--)

                System.out.print(" ");
            System.out.print(s+" ");
            s=s*11;
            System.out.println();
            p--;
        }
    }
}
