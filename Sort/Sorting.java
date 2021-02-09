import java.util.*;
class Sorting
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String [10];
        String sec[]=new String[10];
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter name");
            name[i]=sc.nextLine();
            System.out.println("Enter Roll");
            sec[i]=sc.next();
            sc.nextLine();
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(i+".Name="+name[i]);
            System.out.println(" "+i+".Sec="+sec[i]);
        }
    }
}