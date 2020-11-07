class bill
{
    public static void meth(int u)
    {
        double c=0.0;
        if(u<=100)
        {
            c=u*1.80;
        }
        else if(u<=100 && u<=200)
        {
            c=100*1.80+(u-100)*2.20;
        }
        else if(u>200 && u<=350)
        {
            c=100*1.80+100*2.20+(u-200)*2.80;
        }
        else
        {
            c=100*1.80+100*2.20+150*2.80+(u-350)*4;
        }
        double a=c+50;
        System.out.println("The Total bill is "+a);
    }
}