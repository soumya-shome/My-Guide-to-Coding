import java.io.*;
class noofdigits{
    public static void main()throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        System.out.println("Enter a number");
        int n= Integer.parseInt (br.readLine());
        if (0<=n&&9>=n)
        {
            System.out.println("It is a single digit number");
        }
        else if(10<=n&&99>=n)
        {
            System.out.println("It is a two digits number");
        }
        else if(100<=n&&999>=n)
        {
            System.out.println("It is three digit number");
        }
        else
        {
            System.out.println("More than three digit number");
        }
    

    }
}