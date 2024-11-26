public class Series5
{
    public static void meth(int a)
    {
        int i;
        double s=0;
        for(i=0;i<=10;i++)
        {
            if(i%2==0)
                s=s+Math.pow(a,i);
            else
                s=s-Math.pow(a,i);
        }
        System.out.println("The Sum is "+s);
    }
}
