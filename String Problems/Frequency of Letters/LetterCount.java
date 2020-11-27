import java .util.*;
class LetterCount{
    public static void main(String[] args){
        int a[ ]=new int[26];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        sc.close();
        s=s+" ";
        int l=s.length();
        int q=0;
        for(int j=97;j<=122;j++){
            char c2=(char)j;
            for(int i=0;i<l;i++){
                char c=s.charAt(i);
                if(c==c2)
                    a[q]++;
            }
            q++;
        }
        int e=97;
        for(int k=0;k<26;k++){
            char c2=(char)e;
            if(a[k]>0)
                System.out.println(c2+"\t\t"+a[k]);
            e++;
        }
    }
}