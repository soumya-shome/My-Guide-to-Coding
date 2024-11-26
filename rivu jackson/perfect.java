import java.util.*;
class perfect
{
    public int checkperfect(int n){
        int i ,sum = 0;
        for(i = 1; i<n ;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public static void main()
    {
        Scanner SC = new Scanner (System.in);
        perfect obj=new perfect();
        System.out.println("enter a number");
        int a = SC.nextInt();
        int b=obj.checkperfect(a);
        if(b==1)
        {
            System.out.println("perfect");
        }
        else
        {
            System.out.println("not perfect");
        }
    }
}