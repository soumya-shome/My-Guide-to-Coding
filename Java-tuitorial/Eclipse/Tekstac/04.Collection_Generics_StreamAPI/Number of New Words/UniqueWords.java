//import the necessary packages if needed
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Article");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String longString="\"long\"";
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++)
        {
            if(!(Character.isLetter(sb.charAt(i)))){
                if(sb.charAt(i)!=' ' && sb.equals(longString)){
                    if(sb.charAt(i)!='\''){
                        sb.deleteCharAt(i);
                        System.out.println(sb);
                    }
                }
            }
        }
        String str[]=s.split("[\\s,;:.?!]+");
        Set<String> words=new HashSet<String>(Arrays.asList(str));
        List<String> wordList=new ArrayList<String>(words);
        Collections.sort(wordList);
        int count=0;
        System.out.println("Number of words "+str.length);
        System.out.println("Number of unique words "+wordList.size());
        count=1;
        System.out.println("The words are");
        for(String word: wordList){
            /*for(String temp:str){
                if(word.equals(temp)){
                    count++;
                }
            }*/
            //if(!(word.equals(longString))){
            System.out.println(count+". "+word);//+count);
            count++;
            //}
            //else
              //  longCount=count;
            /*count=0;
            boolean flag=false;
            for(String str2:str){
                if(str2.equals(longString))
                    flag=true;
            }
            if(flag==true)
                System.out.println(longString+":"+longCount);
            */
        }
    }
}