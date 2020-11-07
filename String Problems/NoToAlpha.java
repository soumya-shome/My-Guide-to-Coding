class NoToAlpha
{
    public static void meth()
    {
        for(int i=65;i<=90;i++)
        {
            char c=(char)i;
            char d=(char)(i+32);
            System.out.println(c+"="+i+"  "+d+"="+(32+i));
        }
    }
}