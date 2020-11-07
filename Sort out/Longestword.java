import java.io.*; 
public class Longestword
{ 
    public static void main()throws IOException 
    { 
        InputStreamReader read = new InputStreamReader(System.in); 
        BufferedReader in = new BufferedReader(read); 

        System.out.println("Enter the Sentence"); 

        String sentence = in.readLine(); 
        int len=sentence.length(); 
        int len1=0; int len2=0; int large=0; int sp=0; 
        String word=""; 
        String word1=""; 
        String word2=""; 
        for(int j=0;j<len;j++)
        { 
            char c=sentence.charAt(j); 
            if(c==' ') 
            { 
                word=sentence.substring(sp,j); 
                len1=word.length(); 
                word2=word; 
                break; 
            } 
        } 

        for(int i=0;i<len;i++ )
        { 
            char ch=sentence.charAt(i); 
            if(ch==' ') 
            { 
                word1=sentence.substring(sp,i); 
                len2=word1.length(); 
                sp=i+1; 

                if(len2>len1) 
                { 
                    large=len2; 
                    word2=word1; 
                } 
            } 
        } 

        int ans=Math.max(large,len1); 
        System.out.println(); 
        System.out.println("The longest word is = "+word2); 
        System.out.println("The longest word has "+ans+" alphabets"); 
    } 
} 
