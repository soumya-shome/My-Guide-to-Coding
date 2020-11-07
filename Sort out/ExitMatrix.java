import java.util.*;
class ExitMatrix
{
    static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the rows and Column of the Matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        char m='r';
        int a[][]=new int[r][c];
        System.out.println("Enter the Elements of the matrix ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]!=0 && a[i][j]!=1)
                {
                    System.out.println("Only 1 or 0 ,Enter again");
                    a[i][j]=sc.nextInt();
                }
            }
        }
        System.out.println("The Matrix is ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int r1=0,c1=0;
        while (m!='e')
        {
            if(r1<r && c1<c && r1>=0 && c1>=0)
            {
                if(a[r1][c1]==1)
                {
                    //System.out.println("Current direction = "+m);
                    if(m=='r')
                    {
                        m='d';
                    }
                    else if(m=='d')
                    {
                        m='l';
                    }
                    else if(m=='l')
                    {
                        m='u';
                    }
                    else if(m=='u')
                    {
                        m='r';
                    }
                    //System.out.println("New Direction = "+m);
                    a[r1][c1]=0;
                }
                else
                {
                    //System.out.println("Direction remains Same = "+m);
                }
            }
            if(r1<r && c1<c && r1>=0 && c1>=0)
            {
                switch(m)
                {
                    case 'r':
                    c1++;
                    break;

                    case 'u':
                    r1--;
                    break;

                    case 'l':
                    c1--;
                    break;

                    case 'd':
                    r1++;
                    break;
                }
            }
            else
            {
                switch(m)
                {
                    case 'r':
                    c1--;
                    break;

                    case 'u':
                    r1++;
                    break;

                    case 'l':
                    c1++;
                    break;

                    case 'd':
                    r1--;
                    break;
                }
                m='e';
            }
        }
        System.out.println("Exit Point = "+r1+","+c1);
    }
}