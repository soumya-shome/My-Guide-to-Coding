import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[][]=new int[t][3];
        for(int i=0;i<t;i++)
        {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            a[i][2]=sc.nextInt();
        }

        for(int i=0;i<t;i++)
        {
            double n=a[i][0];
            double v1=a[i][1];
            double v2=a[i][2];
            double sd=Math.sqrt(2)*n;
            double t1=sd/v1;
            double t2=(2*n)/v2;
            if(t1<t2)
            {
                System.out.println("Stairs");
            }
            else
            {
                System.out.println("Elevator");
            }
        }
    }
}