import java.io.*;
public class FileDemo
{
    public static void main(String[] args)throws IOException
    {
        int ch;
        FileReader fr=null;
        try {
        	fr=new FileReader("log.txt");
        }
        catch(FileNotFoundException fe) {
        	System.out.println("File not found");
        }
        while((ch=fr.read())!=-1) {
        	System.out.print((char)ch);
        }
        fr.close();
    }
}