public class TouristUtility{
    private Tourist[] tourt;
    private int count=0;

    public void setTourists(Tourist t){
        this.tourt[this.count]=t;
        this.count++;
    }
    public TouristUtility(int n){
        tourt=new Tourist[n];
    }
    public Tourist[] getTourists(){
        return tourt;
    }

    public void addValidToursist(String records[]){
        int days=Integer.parseInt(records[3]);
        Tourist t=new Tourist(records[0],records[1],records[2],days);
        String tid=t.getTouristId();
        String tnm=t.getTouristName();

        String nm_chk=tnm.substring(0,2).toUpperCase();

        int len=tid.length();
        String id_nm=tnm.substring(0,2);
        String id_no=tnm.substring(2);

        char[] noArray=id_no.toCharArray();
        boolean b=true;

        for(char c:noArray){
            if(c<='0' || c>='9'){
                b=false;
                break;
            }
        }

        if(len==6 && id_nm.equals(nm_chk) && b==true){
            setTourists(t);
        }
        
    }
}