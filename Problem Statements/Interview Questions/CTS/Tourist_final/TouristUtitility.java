/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP
 */
import java.util.*;
public class TouristUtitility {
    private Tourist[] tourist;
    public void setTourist(Tourist[] tourist)
    {
        this.tourist=tourist;
    }
    public Tourist[] getTourist()
    {
        return tourist;
    }
    public void addValidTourist(String records[])
    {
        String id=records[0];
        String name=records[1];
        String des=records[2];
        int dot=Integer.parseInt(records[3]);
        int val=0;
        int tsize=0;
        int z=0;
        if(id.length()==6)
        {
            val=0;
            String id2=id.substring(0,2);
            id2=id2.toUpperCase();
            String name2=name.substring(0,2);
            name2=name2.toUpperCase();
            int idNumVal=0;
            if(id2.equals(name2))
            {
                for(int i=2;i<id.length();i++)
                {
                    if(id.charAt(i)>='0'&&id.charAt(i)<='9')
                    {
                        ++idNumVal;
                    }
                }
                if(idNumVal==4)
                {
                    val=1;
                    ++tsize;
                }
            }
        }
        if(val==1)
        {
            
            Tourist validTourist=new Tourist(id,name,des,dot);
            Tourist[] t=new Tourist[tsize];
            t[z]=validTourist;
            setTourist(t);
            ++z;
        }
       
    }
    
    public String[] calculateTravelCost()
    {
       Tourist[] t=getTourist();
       ArrayList<String> s=new ArrayList<String>();
       String ans="";
       for(int i=0;i<t.length;i++)
       {
           ans="";
           Tourist tt=t[i];
           String id=tt.getTouristId();
           String name=tt.getTouristName();
           String des=tt.getDestination();
           int dot=tt.getDaysOfTravel();
           int tcpd=0;
           double travelCost=0;
           if(des.equals("Goa"))
           {
               tcpd=2000;
               travelCost=tcpd*dot;
           }
           else if(des.equals("Delhi"))
           {
               tcpd=2500;
               travelCost=tcpd*dot;
           }
           else if(des.equals("Manali"))
           {
               tcpd=3000;
               travelCost=tcpd*dot;
           }
           if(dot>5)
           {
               travelCost=travelCost-(travelCost*0.15);
           }
           ans=ans+id+":"+name+":"+des+":"+String.valueOf(dot)+":"+String.valueOf(travelCost);
           s.add(ans);
       }
       String[] arr=new String[s.size()];
       for(int i=0;i<s.size();i++)
       {
           arr[i]=s.get(i);
       }
       return arr;
    }
}