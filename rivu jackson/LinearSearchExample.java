public class LinearSearchExample{   
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 50;
        int pos=-1;
        for(int i=0;i<a1.length;i++){    
            if(a1[i] == key){    
                pos=i;
                break;
            }    
        } 
        System.out.println(key+" is found at index: "+pos);    
    }    
}