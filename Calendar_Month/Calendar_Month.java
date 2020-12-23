import java.util.*;
class Calendar_Month{
    int dayinmonth(int month,int year){
        int day=0;
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            day=31;
        else if (month==4 || month==6 || month==9 || month==11)
            day=30;
        else{
            if (year%400==0 && year%4==0)
                if (year%100!=0)
                    day=29;
            else
                day=28;
        }
        return day;
    }
    
    int dayofweek(int d,int m,int y){ 
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 } ;
        y -= (m < 3) ? 1 : 0;
        return (( y + ((int)y / 4) - ((int)y / 100) + ((int)y / 400) + t[m - 1] + d) % 7);
    }

    public static void main(String[] args){
        Calendar_Month ob=new Calendar_Month();
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Year:");
        int y=sc.nextInt();
        System.out.print("Enter Month (In Number):");
        int m=sc.nextInt();
        sc.close();
        int t=ob.dayofweek(1,m,y);
	    int day=ob.dayinmonth(m,y);
        System.out.println("M\tT\tW\tTh\tF\tS\tS");
        int a=1;
        for(int i=1;i<=6;i++){
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