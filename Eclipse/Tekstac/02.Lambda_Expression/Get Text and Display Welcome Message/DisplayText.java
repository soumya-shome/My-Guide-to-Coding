import java.util.*;
public interface DisplayText
{
    public void displayText(String text);
    
    public default String getInput(){
    	Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        return str;
    }
}