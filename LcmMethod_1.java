import java.io.*;
class LcmMethod_1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b,lcm=1;
        System.out.print("Enter the 1st number : ");
        a=Integer.parseInt(br.readLine());
        System.out.print("Enter the 2nd number : ");
        b=Integer.parseInt(br.readLine());
        for(int i=a;i<a*b;i++) //Even if you start the for loop by 1, you will get the answer, but starting it from either the first or the second number reduces the number of times the for loop is executed.
        {
            if(i%a==0 && i%b==0) //Checking the first number which is divisible by both the numbers
            {
                lcm=i;
                break; //exiting from the loop, as we don’t need anymore checking after getting the LCM
            }
        }
        System.out.println("L.C.M. = "+lcm);
    }
}
