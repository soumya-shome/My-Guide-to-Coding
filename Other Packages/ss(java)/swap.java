public class swap
{
    public static void meth (int n)
    {
        int m=n/100;
        int c=n%100;
        int v=c%10;
        int s=c/10;
        double i=Math.pow(m,2);
        double j=Math.pow(v,3);
        System.out.println("square value "+i);
        System.out.println("cube value "+j);
    }
}