import java.util.*;
class free
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        String str=sc.nextLine();
        str=str+" ";
        int l=str.length();
        String word="";
        for(int i=0;i<l;i++){
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                System.out.println(word);
                word="";
            }
        }
        
        
        String word2="";
        for(int i=l-1;i>=0;i--){
            char ch=str.charAt(i);
            word2=word2+ch;
        }
        System.out.println("Reverse of the string:"+word2);
    }
}