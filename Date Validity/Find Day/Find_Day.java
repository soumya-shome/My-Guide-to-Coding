import java.util.*;
class Find_Day{
    int day(int d,int m,int y){
        int yc=0,day=0;
        int mc[]={0,3,3,6,1,4,6,2,5,0,3,5};
        if(y>=1600 && y<=1699)
            yc=6;
        else if(y>=1700 && y<=1799)
            yc=4;
        else if(y>=1800 && y<=1899)
            yc=2;
        else if(y>=1900 && y<=1999)
            yc=0;
        else if(y>=2000 && y<=2099)
            yc=6;
        
        day=d+mc[m-1]+(y%100)+((y%100)/4)+yc;
        day=day%7;
        return day;
    }

    public static void main(String[] args){
        Find_Day ob=new Find_Day();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter in Number");
        System.out.print("Enter Date : ");
        int d=sc.nextInt();
        System.out.print("Enter Month : ");
        int m=sc.nextInt();
        System.out.print("Enter Year : ");
        int y=sc.nextInt();
        sc.close();
        System.out.println("Date : "+d+"-"+m+"-"+y);
        int days=ob.day(d,m,y);
        String da="";
        switch(days){
            case 0:
                da="Sunday";
            break;
            case 1:
                da="Monday";
            break;
            case 2:
                da="Tuesday";
            break;
            case 3:
                da="Wednesday";
            break;
            case 4:
                da="Thursday";
            break;
            case 5:
                da="Friday";
            break;
            case 6:
                da="Saturday";
            break;
        }
        System.out.print("The Day is : "+da);


    }
}