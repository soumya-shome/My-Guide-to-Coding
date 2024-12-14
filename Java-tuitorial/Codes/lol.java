import java.util.*;
class lol
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total distance travelled");
        int dist=sc.nextInt();
        int tot=0;
        if(dist<=100)
        {
            tot=dist*30;
        }
        else if(dist>100 && dist <=300)
        {
            tot=100*30+(dist-100)*20;
        }
        else if(dist>300 && dist <=700)
        {
            tot=100*30+200*20+(dist-300)*17;
        }
        else if(dist>700)
        {
            tot=100*30+200*20+300*17+(dist-700)*15;
        }
        System.out.println("total cost ="+tot);
    }
}
