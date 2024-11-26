import java.io.*;
class paoe
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        System.out.println("Enter a number");
        int n= Integer.parseInt (br.readLine());
        System.out.println("Enter a choice");
        int f= Integer.parseInt (br.readLine());
        int d=0;
        if(f==1)
        {
            d= n*n;
        }
        else if(f==2)
        {
            d= n*n*n;
        }
        System.out.println("the choice is"+f);
        System.out.println("the result is"+d);   
    }
}