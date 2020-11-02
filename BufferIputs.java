import java.io.*;
class BufferIputs
{
    public static void main()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        
        System.out.println("Enter a character");
        char c=(char)(br.read());
        
        System.out.println("Enter a Integer");
        int a=Integer.parseInt(br.readLine());
        
        System.out.println("Enter a Double");
        double b=Double.parseDouble(br.readLine());
        
        System.out.println("Enter a Sentence");
        String s=br.readLine();
        
        System.out.println("Character= "+c);
        System.out.println("Sentence= "+s);
        System.out.println("Intger= "+a);
        System.out.println("Double= "+b);
    }
}
    