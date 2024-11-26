import java.util.*;
class sdsd2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        String s =sc.nextLine();
        s=s.toUpperCase();
        System.out.println(s);
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char c=s.charAt(i);
            char c2=s.charAt(i+1);
            //System.out.println(c+" "+c2);
            if(c==c2){
                count++;
            }
        }
        System.out.println(count);
    }
}