import java.util.*;
class Calendar{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Year:");
        int y=sc.nextInt();
        System.out.print("Enter Month (In Number):");
        int m=sc.nextInt();
        String mo="";
        switch(m){
            case 1:
                mo="January";
            break;
            case 2:
                mo="February";
            break;
            case 3:
                mo="March";
            break;
            case 4:
                mo="April";
            break;
            case 5:
                mo="May";
            break;
            case 6:
                mo="June";
            break;
            case 7:
                mo="July";
            break;
            case 8:
                mo="August";
            break;
            case 9:
                mo="September";
            break;
            case 10:
                mo="October";
            break;
            case 11:
                mo="November";
            break;
            case 12:
                mo="December";
            break;
        }
        System.out.print("Enter the First Day of "+mo+" : ");
        String d=sc.next();
        sc.close();
        int t=0;
        if(d.equalsIgnoreCase("Sunday"))
            t=1;
        else if(d.equalsIgnoreCase("monday"))
            t=2;
        else if(d.equalsIgnoreCase("tuesday"))
            t=3;
        else if(d.equalsIgnoreCase("wednesday"))
            t=4;
        else if(d.equalsIgnoreCase("thursday"))
            t=5;
        else if(d.equalsIgnoreCase("friday"))
            t=6;
        else if(d.equalsIgnoreCase("saturday"))
            t=7;
        int day=0;
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 ||m==12)
            day=31;
        else if(m==4 || m==6 || m==9 || m==11)
            day=30;
        else
        {
            if(y%400==0 && y%4==0)
                if(y%100!=0)
                    day=29;
            else
                day=28;
        }
        System.out.println(t);
        System.out.println("S\tM\tT\tW\tTh\tF\tS");
        int a=1;
        for(int i=1;i<=6;i++)
        {
            if(a>day)
                break;
            for (int j=1;j<=7;j++){
                if(i==1){
                    if(j>=t){
                        System.out.print(a+"\t");
                        a++;
                    }
                    else
                        System.out.print(" \t");
                    //System.out.println();
                }
                else{
                    System.out.print(a+"\t");
                    a++;
                }
                if(a>day)
                    break;
            }
            System.out.println();
        }
    }
}