//toggle case
import java.util.*;
class ToggleCase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            boolean b=Character.isUpperCase(c);
            char p;
            if(b==true){
                p=Character.toLowerCase(c);
                System.out.print(p);
            }
            else{
                p=Character.toUpperCase(c);
                System.out.print(p);
            }
        }
    }
}