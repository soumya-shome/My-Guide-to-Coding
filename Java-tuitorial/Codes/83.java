import java.util.*;

class Main
{
    int findMaxDay(String mname, int y)
    {
        String months[] = {"","January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December"};
        int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
         
        if((y%400==0) || ((y%100!=0)&&(y%4==0)))
        {
            D[2]=29;
        }
        int max = 0;
        for(int i=1; i<=12; i++)
        {
            if(mname.equalsIgnoreCase(months[i]))
            {
                max = D[i]; 
            }
        }
        return max;
    }
     
    
    int findDayNo(String wname)
    {
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", 
                            "Saturday"};
        int f = 0;
        for(int i=0; i<7; i++)
        {
            if(wname.equalsIgnoreCase(days[i]))
            {
                f = i;  
            }
        }
        return f;
    }
 }

