import java .util.*;
class t5
{
    int n;
    int a[][];
    String name[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students ");
        n=sc.nextInt();
        a=new int[n][7];
        name=new String [n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of Student");
            name[i]=sc.next();
            System.out.println("Enter the Id of the student");
            a[i][0]=sc.nextInt();
            System.out.println("Enter The marks of Physics,Chemistry ,Maths,English ,and Computer");
            for(int j=1;j<6;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }

    void total()
    {
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=1;j<=5;j++)
            {
                sum=sum+a[i][j];
            }
            a[i][6]=sum;
        }
    }

    void print()
    {
        System.out.println("All Details of the  Students");
        System.out.println("Name\tID\tPhy\tChem\tMaths\tEng\tComp\tTotal");
        for(int i=0;i<n;i++)
        {
            System.out.print(name[i]+"\t"+a[i][0]+"\t");
            for(int j=1;j<=6;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    void highest()
    {

        for(int j=1;j<=5;j++)
        {
            int max=0;
            switch(j)
            {
                case 1:
                    System.out.println("Physics");
                break;
                
                case 2:
                    System.out.println("Chemistry");
                break;
                
                case 3:
                    System.out.println("Maths");
                break;
                
                case 4:
                    System.out.println("English");
                break;
                
                case 5:
                    System.out.println("Computer");
                break;
            }
            for(int i=0;i<n;i++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
            System.out.println(" Highest="+max);
            for(int i=0;i<n;i++)
            {
                if(a[i][j]==max)
                {
                    System.out.println("Id: "+a[i][0]+" Name:"+name[i]);
                }
            }
        }
    }

    static void main()
    {
        t5 ob=new t5();
        ob.input();
        ob.total();
        ob.print();
        System.out.println("----------------------------------------------------");
        ob.highest();
    }
}
 