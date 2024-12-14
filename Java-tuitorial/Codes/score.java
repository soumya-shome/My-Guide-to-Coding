import java.util.*;
class score{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String c[]=new String[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the names of the player");
            c[i]=sc.next();
        }
        int s[]=new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the scores");
            s[i]=sc.nextInt();
        }
        System.out.println("Name\tScore");
        for(int i=0;i<3;i++)
        {
            System.out.println(c[i]+"\t"+s[i]);
        }
    }
}