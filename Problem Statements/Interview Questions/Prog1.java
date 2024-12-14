import java.util.*;
class Prog1{
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a text");
        int a=0,b=0;
        String s=sc.next();
        int l=s.length();
        String w="";
        for(int j=0;j<l;j++){
            char c=s.charAt(j);
            String s2=Character.toString(c);
            if(!s2.equals("'")){
                s3=s3+c;
            }
            else{
                for(int k=j;k<l && Character.toString(s.charAt(k))!="'"; k++){
                    if(Character.toString(s.charAt(k))=="'")
                        break;
                    w+=s.charAt(k);
                }
                find(w);
                w="";
                j++;
            }
        }
    }

    void find(String s){
        int l=s.length();
        int e=0;
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(c=='=')
                e++;
        }
        System.out.println("= found "+e+" times");
    }

    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Inputs");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            input();
        }
    }
}