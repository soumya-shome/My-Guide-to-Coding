//binarytohexadecimal
class binary
{
    public static void main(int n)
    {
        int m[]=new int[100];
        int r=0;
        int i=0;
        while(n>0)
        {
            r=n%2;
            m[i]=r;
            i++;
            n=n/2;
        }
        for(int j=i-1;j>0;j--)
        {
            System.out.print(m[j]);
        }
    }
}