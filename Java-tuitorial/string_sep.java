class string_sep
{
    public static void main()
    {
        int a=2;
        int A=3;
        System.out.print(35/0);
        String s="The sky is blue";
        s=s+' ';
        int l=s.length();
        String word="";
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                word=word+c;
            }
            else
            {
                
                word="";
            }
        }
    }
}
            