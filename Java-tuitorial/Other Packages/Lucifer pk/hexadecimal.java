
class hexadecimal
{
    void main(int n)
    {
        int m[]=new int[100];
        int r=0;
        int i=0;
        while(n>0)
        {
            r=n%16;
            m[i]=r;
            i++;
            n=n/16;
        }
        for(int j=i-1;j>0;j--)
        {
            System.out.println(m[j]);
        }
    }
}