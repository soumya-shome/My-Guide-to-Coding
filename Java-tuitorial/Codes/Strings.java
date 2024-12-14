public class Strings{
    public static void main(){
        String s="Hello This is Java";
        System.out.println(s.lastIndexOf('l'));
        s=s+" ";
        int l=s.length();
        String s2="";
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(c!=' '){
                s2=s2+c;
            }
            else{
                System.out.println(s2);
                s2="";
            }
        }
    }
}