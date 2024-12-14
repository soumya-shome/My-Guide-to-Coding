import java.util.*;
class Q11{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 characters");
        String str=sc.nextLine();
        str=str+" ";
        str=str.toUpperCase();
        String word="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
            {
                word+=ch;
            }
            else{
                System.out.print(word);
                word="";
            }
        }
    }
}