import java.util.*;
class electricity
{
    double cal(int u)
    {
        double c=0.0D;
        if(u<=100)
            c=(u*1.25);
        else if((u>100)&&(u<=200))
            c=((100*1.25 )+(u-100)*1.50);
        else if(u>200)
            c=((100*1.25)+(100*1.50)+(u-200)*1.80);
        return(c);
    }

    public static void main(String args[])
    {
        int prev,pres,un,cn;
        double amt = 0.0D;
        String name;
        Scanner in =new Scanner(System.in);
        electricity ob=new electricity();
        System.out.println("Enter consumer's name");
        name=in.nextLine();
        System.out.println("Enter consumer's number");
        cn=in.nextInt();
        System.out.println("Enter previous reading");
        prev=in.nextInt();
        System.out.println("Enter present reading");
        pres=in.nextInt();
        un=pres-prev;
        amt=ob.cal(un);
        System.out.println("ConsumerNo.\tName\tUnit Consumed\t   Amount");
        System.out.println(cn+"\t"+name+"\t"+un+"\t"+amt);
    }
}