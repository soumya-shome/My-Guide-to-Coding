import java.util.*;
class time{
    public static void main(String[] args)
    {
        int a[]=new int [3];
        Scanner sc=new Scanner (System.in);        
        System.out.println("Enter a date in form dd.mm.yyy;");        
        String d1=sc.next();        
        d1=d1.trim();        
        d1=d1+".";        
        int l1=d1.length();        
        String p="";        
        int u=0;        
        for(int i=0;i<l1;i++)        
        {            
            char c=d1.charAt(i);            
            if(c!='.')            
            {                
                p=p+c;            
            }            
            else            
            {                
                a[u]=Integer.parseInt(p);                
                p="";                
                u++;            
                }        
        }
        int b[]=new int[3];        
        System.out.println("Enter another date in form dd.mm.yyy;");        
        String d2=sc.next();        
        d2=d2.trim();        
        d2=d2+".";        
        int l2=d2.length();        
        String p2="";        
        int u2=0;        
        for(int i2=0;i2<l2;i2++)        
        {            
            char c2=d2.charAt(i2);            
            if(c2!='.')            
            {                
                p2=p2+c2;            
            }            
            else            
            {                
                b[u2]=Integer.parseInt(p2);                
                p2="";                
                u2++;            
            }        
        }        
        int days=0;        
        if(b[0]>31 || b[1]>12 || a[0]>31 || a[1]>12)        
        {            
            System.out.println("Wrong Input");        
        }        
        else        
        {            
            int g=0;            
            int y;            
            for(int j=a[2]+1;j<b[2];j++)            
            {                
                if(j%400==0)                
                {                    
                    days=days+366;                
                }                
                else                
                {                    
                    days=days+365;                
                }            
            }            
            System.out.println("1"+days);            
            int q[]={31,31,28,31,30,31,30,31,31,30,31,30};            
            int o=a[1]%12;//the month            
            int day3=q[o]-a[0];            
            days=days+day3;//for the given month            
            for(int k=a[1]+1;k<=12;k++)            
            {                
                int o2=k%12;                
                days=days+q[o2];            
            }            
            if(a[1]%400==0 && a[1]>=2)            
            {                
                days++;            
            }            
            System.out.println("DAys ="+days);        
        }    
    }
}