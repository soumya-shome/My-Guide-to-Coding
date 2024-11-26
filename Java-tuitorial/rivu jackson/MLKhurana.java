import java.util.*;
class MLKhurana
{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String s=sc.nextLine();
        s=s+' ';
        int l=s.length();
        
        int count=0;
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                count++;
            }
        }
        System.out.println("Count :"+count);
        //Madan_Lal_Khurana_ 
        int c2=0;
        String word="";
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                word=word+c;
            }
            else
            {
                c2++;
                if(c2==count)
                {
                    System.out.print(word);
                }
                else
                {
                    System.out.print(word.charAt(0)+".");
                }
                word="";
            }
        }
    }
}