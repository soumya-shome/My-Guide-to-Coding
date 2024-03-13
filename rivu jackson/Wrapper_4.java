import java.util.*;
class Wrapper_4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=sc.nextLine();
        int alpha=0,digit=0,spl=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            char a=str.charAt(i);
            //System.out.println("\'"+a+"\'");
            if(Character.isLetter(a)){
                alpha++;
            }
            else if(Character.isDigit(a)){
                digit++;
            }
            else{
                spl++;
            }
        }
        System.out.println("Alphabets : "+alpha);
        System.out.println("Digits : "+digit);
        System.out.println("Others : "+spl);
    }
}