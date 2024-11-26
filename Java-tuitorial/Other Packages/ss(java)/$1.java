class $1
{
    public static void meth(int a,int b,int c)
    {
        int d=a+b+c;
        if(d<=180)
        {
            System.out.println("Possible");
            if(a==90||b==90||c==90)
                System.out.println("Right angle triangle");
            else if(a>=90||b>=90||c>=90)
                System.out.println("Obtuse angle triangle");
            else if(a<=90||b<=90||c<=90)
                System.out.println("Acute angle triangle");
        }
        else
            System.out.println("Triangle not possible");
    }
}