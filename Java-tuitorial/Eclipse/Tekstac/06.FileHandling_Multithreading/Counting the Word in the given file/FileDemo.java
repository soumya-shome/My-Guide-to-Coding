import java.io.*;
public class FileDemo{
    public static void main(String[] args)throws IOException
    {
        String line;
        int count=0;
        FileReader f=null;
        try {
        	f=new FileReader("log.txt");
        }catch(FileNotFoundException fe) {
        	System.out.println("File not found");
        }
        BufferedReader br=new BufferedReader(f);
        while((line=br.readLine())!=null) {
        	String words[]=line.split(" ");
        	for(int i=0;i<words.length;i++) {
        		String s=words[i];
        		if(s.equalsIgnoreCase("Knowledge")) {
        			count++;
        		}
        	}
        }
        System.out.print(count);
        br.close();
    }
}