import java.util.*;
class Classrec
{
    static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Students");
        int n=sc.nextInt();
        String name[]=new String[n];
        int rec[][]=new int[n][6];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Student Name,ID, and marks of the 5 subjects in following order");
            name[i]=sc.next();
            for(int j=0;j<6;j++)
            {
                rec[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("------------------------------------");
        int total[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<6;j++)
            {
                total[i]+=rec[i][j];
            }
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println("ID="+rec[i][0]);
            System.out.println("Name="+name[i]);
            for(int j=1;j<6;j++)
            {
                System.out.print(rec[i][j]+" ");
            }
            System.out.println("Total="+total[i]);
        }
    }
}