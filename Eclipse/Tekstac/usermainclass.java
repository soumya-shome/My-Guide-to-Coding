import java.util.*;
import java.io.*;
public class usermainclass{
    public static String butwise(int input1){
        String res="";
        res=Integer.toBinaryString(input1);
//System.out.println(res);
        int max=1;
        int min=res.length();
        int count=0;
        for(int i=res.length()-1;i>=0;i--){
            //System.out.println(i);
            if(res.charAt(i)=='1'){
                count++;
                if(max<(i+1))
                    max=(i+1);
                if(min>(i+1))
                    min=(i+1);
            }
        }
        String f=Integer.toString(count) +"#"+Integer.toString(min)+"#"+Integer.toString(max);
        return f;
    }

    public static void main(String[] args){
        System.out.println(butwise(10));
    }
}