import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class File_ReadLines
{
    static void readLines(File f)throws IOException
    {
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
    
    static void main()
    {
        String s="01";
        File f= new File("D:/NetBeansProjects/Know Your Number/Details/"+s+".txt");
        try{
            readLines(f);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}   