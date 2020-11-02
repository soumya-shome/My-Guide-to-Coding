
import java.io.*;
class max_min_digit

{
    public static void meth()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a no.");
        int a=Integer.parseInt(br.readLine());
        int min=9,max=0;
        while(a!=0)
        {
            int y=a%10;
            if(y<min)
            {
                min=y;
            }
            if(y>max)
            {
                max=y;
            }
            a=a/10;
        }
        System.out.println("The greatest no. is "+max);
        System.out.println("The smallest no. is "+min);
    }
}

        