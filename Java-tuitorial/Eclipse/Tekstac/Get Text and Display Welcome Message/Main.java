public class Main implements DisplayText
{
    public static void main(String args[])
    {
        DisplayText ob=welcomeMessage();
        String str=ob.getInput();
        ob.displayText(str);
        
    }
    public static DisplayText welcomeMessage(){
        DisplayText obj=(text)->System.out.println("Welcome "+text);
       
        return obj;
    }
    public void displayText(String text){
        System.out.println(text);
    }
}