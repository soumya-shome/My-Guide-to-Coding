class JAVA97_1
{
    public static void main(String[] args)
    {
        int s=7;
        for(int i=1;i<=7;i++)
        {
            for(int sp=1;sp<=s;sp++)
            {
                System.out.print(" ");
            }
            s--;
            int q=(int)Math.pow(11,i-1);
            String s2=Integer.toString(q);
            int l=s2.length();
            for(int j=0;j<l;j++)
            {
                char c=s2.charAt(j);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}