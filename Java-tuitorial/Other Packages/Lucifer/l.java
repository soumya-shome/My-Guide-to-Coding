import java.util.*;
class l
{
    public static void mein()
    {
        int m[][]={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        int n[][]=new int [4][4];
        System.out.println("the no. are");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i2=0;i2<4;i2++)
        {
            for(int j2=0;j2<4;j2++)
            {
                n[j2][i2]=m[i2][j2];
            }
        }
        
        System.out.println("the new no. are");
        for(int i3=0;i3<4;i3++)
        {
            for(int j3=0;j3<4;j3++)
            {
                System.out.print(n[i3][j3]+" ");
            }
            System.out.println();
        }
    }
}